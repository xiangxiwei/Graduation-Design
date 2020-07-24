package com.xxw.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxw.entity.Admin;
import com.xxw.service.AdminService;
import com.xxw.service.impl.AdminServiceImpl;

@SuppressWarnings("serial")
public class AdminServlet extends HttpServlet {
	private AdminService adminService = new AdminServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String action = req.getParameter("action");
		if ("addAdmin".equals(action)) {
			addAdmin(req, resp);
		} else if ("list".equals(action)) {
			list(req, resp);
		}else if("editsave".equals(action)) {
			editsave(req,resp);
		}else {
			try {
				throw new Exception("没有定义");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void editsave(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			Admin admin = new Admin();
			admin.setAdminName(req.getParameter("AdminName"));
		    admin.setPassword(req.getParameter("password"));
		    adminService.edit(admin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("index.s?action=list");
		
	}

	private void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String AdminName = req.getParameter("AdminName");
			String password = req.getParameter("password");
			boolean flag = adminService.isLogain(AdminName, password);
			// 如果登陆成功跳转到首页
			if (flag) {
				req.getRequestDispatcher("/show.jsp").forward(req, resp);
			} else {
				req.getRequestDispatcher("/error.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addAdmin(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		try {
			Admin admin = new Admin();
			admin.setAdminName(req.getParameter("AdminName"));
			admin.setPassword(req.getParameter("password"));
			adminService.add(admin);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("success.jsp");
		// req.getRequestDispatcher("show.jsp").forward(req, resp);

	}

}
