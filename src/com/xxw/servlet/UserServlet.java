package com.xxw.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxw.entity.User;
import com.xxw.service.UserService;
import com.xxw.service.impl.UserServiceImpl;

@SuppressWarnings("serial")
public class UserServlet extends HttpServlet {

	private UserService userService = new UserServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		// 处理的请求格式为：user.do?action=xxx
		String action = req.getParameter("action");
//		System.out.println(action);
		// user.do?action=list 显示用户列表界面
		if ("list".equals(action)) {
			list(req, resp);
		}
		// user.do?action=addview 显示用户录入界面
		else if ("addview".equals(action)) {
			addview(req, resp);
		}
		// user.do?action=addsave 在用户录入界面提交保存用户信息
		else if ("addsave".equals(action)) {
			addsave(req, resp);
		}
		// user.do?action=editview&id=xxx 根据id获取用户对象，并显示用户修改界面
		else if ("editview".equals(action)) {
			editview(req, resp);
		}
		// user.do?action=editsave 在用户修改界面提交保存用户信息
		else if ("editsave".equals(action)) {
			editsave(req, resp);
		}
		// user.do?action=delete&id=xxx 删除某个用户信息
		else if ("delete".equals(action)) {
			delete(req, resp);
		} 
		else {
			throw new ServletException("请求未定义！");
		}
	}


	// 删除某个用户
	private void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			Integer employeeId = Integer.valueOf(req.getParameter("employeeId"));
			userService.delete(employeeId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// //删除后重定向跳转到用户列表界面
		resp.sendRedirect("user.do?action=list");
	}

	// 修改用户保存，同时跳转到用户列表界面
	private void editsave(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			// 构造User对象
			User user = new User();
			user.setEmployeeId(Integer.valueOf(req.getParameter("employeeId")));
			user.setName(req.getParameter("name"));
			user.setCardNumber(req.getParameter("cardNumber"));
			user.setNation(req.getParameter("nation"));
			user.setSex(req.getParameter("sex"));
			user.setBirthday(sdf.parse(req.getParameter("birthday")));
			user.setGraduateSchool(req.getParameter("graduateSchool"));
			user.setSchoolRecord(req.getParameter("schoolRecord"));
			user.setDepartment(req.getParameter("department"));
			user.setTelephone(req.getParameter("telephone"));
			user.setPositionName(req.getParameter("positionName"));
			userService.edit(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("user.do?action=list");
	}

	// 显示修改用户界面
	private void editview(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// 根据id查询用户对象，并将对象存放到request的属性中
			User user = userService.get(Integer.parseInt(req.getParameter("employeeId")));
			req.setAttribute("user", user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 跳转到修改用户userEdit.jsp界面
		req.getRequestDispatcher("userEdit.jsp").forward(req, resp);
	}

	private void addsave(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 获取表单提价的用户信息
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			// 构造User对象
			User user = new User();
			user.setEmployeeId(Integer.valueOf(req.getParameter("employeeId")));
			user.setName(req.getParameter("cardNumber"));
			user.setCardNumber(req.getParameter("cardNumber"));
			user.setNation(req.getParameter("nation"));
			user.setSex(req.getParameter("sex"));
			if (req.getParameter("birthday") != null && !req.getParameter("birthday").equals("")) {
				user.setBirthday(sdf.parse(req.getParameter("birthday")));
			}
			user.setGraduateSchool(req.getParameter("graduateSchool"));
			user.setSchoolRecord(req.getParameter("schoolRecord"));
			user.setDepartment(req.getParameter("department"));
			user.setTelephone(req.getParameter("telephone"));
			user.setPositionName(req.getParameter("positionName"));
			userService.add(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("user.do?action=list");
	}

	private void addview(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 跳转到添加用户userAdd.jsp界面
		resp.sendRedirect("userAdd.jsp");
	}

	// 获取用户列表数据，并显示用户列表
	private void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// 获取用户列表
			List<User> userList = userService.list();
			req.setAttribute("userList", userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 跳转到userList.jsp界面
		req.getRequestDispatcher("userList.jsp").forward(req, resp);
	}

}
