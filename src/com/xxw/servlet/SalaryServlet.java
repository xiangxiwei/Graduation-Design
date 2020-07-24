package com.xxw.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxw.entity.Salary;
import com.xxw.service.SalaryService;
import com.xxw.service.impl.SalaryServiceImpl;

@SuppressWarnings("serial")
public class SalaryServlet extends HttpServlet {
	private SalaryService salaryService = new SalaryServiceImpl();

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
		if ("list".equals(action)) {
			list(req, resp);
		}
		//显示用户录入界面
		else if ("addview".equals(action)) {
			addview(req, resp);
		}
		//在用户录入界面提交保存用户信息
		else if ("addsave".equals(action)) {
			addsave(req, resp);
		}
		//根据id获取用户对象，并显示用户修改界面
		else if ("editview".equals(action)) {
			editview(req, resp);
		}
		//在用户修改界面提交保存用户信息
		else if ("editsave".equals(action)) {
			editsave(req, resp);
		}
		//删除某个用户信息
		else if ("delete".equals(action)) {
			delete(req, resp);
		} else {
			throw new ServletException("请求未定义！");
		}

	}

	private void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			Integer salaryId = Integer.valueOf(req.getParameter("salaryId"));
			salaryService.delete(salaryId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("salary.do?action=list");
	}

	//修改保存
	private void editsave(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
		Salary salary = new Salary();
		//Integer id = Integer.valueOf(req.getParameter("salaryId"));
		salary.setSalaryId(Integer.valueOf(req.getParameter("salaryId")));
		salary.setEmployeeId(req.getParameter("employeeId"));
		salary.setName(req.getParameter("name"));
		salary.setYear(Integer.valueOf(req.getParameter("year")));
		salary.setMonth(Integer.valueOf(req.getParameter("month")));
		salary.setBasicWage(req.getParameter("basicWage"));
		salary.setOvertimeWage(req.getParameter("overtimeWage"));
		salary.setTrafficWage(req.getParameter("trafficWage"));
		salary.setTotalWage(req.getParameter("totalWage"));
		salary.setKaoqinReduce(req.getParameter("kaoqinReduce"));
		salary.setSecureReduce(req.getParameter("secureReduce"));
		salary.setTaxReduce(req.getParameter("taxReduce"));
		salary.setTotalReduce(req.getParameter("totalReduce"));
		salary.setRealWage(req.getParameter("realWage"));
		salaryService.edit(salary);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("salary.do?action=list");
	}

	//显示修改页面
	private void editview(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Salary salary = salaryService.get(Integer.parseInt(req.getParameter("salaryId")));
		req.setAttribute("salary", salary);
		req.getRequestDispatcher("salaryEdit.jsp").forward(req, resp);
	}

	private void addsave(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
		Salary salary = new Salary();
		salary.setSalaryId(Integer.valueOf(req.getParameter("salaryId")));
		salary.setEmployeeId(req.getParameter("employeeId"));
		salary.setName(req.getParameter("name"));
		salary.setYear(Integer.valueOf(req.getParameter("year")));
		salary.setMonth(Integer.valueOf(req.getParameter("month")));
		salary.setBasicWage(req.getParameter("basicWage"));
		salary.setOvertimeWage(req.getParameter("overtimeWage"));
		salary.setTrafficWage(req.getParameter("trafficWage"));
		salary.setTotalWage(req.getParameter("totalWage"));
		salary.setKaoqinReduce(req.getParameter("kaoqinReduce"));
		salary.setSecureReduce(req.getParameter("secureReduce"));
		salary.setTaxReduce(req.getParameter("taxReduce"));
		salary.setTotalReduce(req.getParameter("totalReduce"));
		salary.setRealWage(req.getParameter("realWage"));
		salaryService.add(salary);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("salary.do?action=list");
	}

	private void addview(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.sendRedirect("salary.jsp");

	}

	private void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<Salary> salaryList = salaryService.list();
			req.setAttribute("salaryList", salaryList);
		//	System.out.println(salaryList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("salaryList.jsp").forward(req, resp);
		// resp.sendRedirect("salaryList.jsp");
	}
}
