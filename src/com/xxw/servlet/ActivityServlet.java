package com.xxw.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxw.entity.Activity;
import com.xxw.service.ActivityService;
import com.xxw.service.impl.ActivityServiceImpl;

@SuppressWarnings("serial")
public class ActivityServlet extends HttpServlet{
	private ActivityService activityService = new ActivityServiceImpl();
	
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
		}else if ("editview".equals(action)) {
			editview(req, resp);
		}
		else if ("editsave".equals(action)) {
			editsave(req, resp);
		}else if ("addview".equals(action)) {
			addview(req, resp);
		}
		// user.do?action=addsave 在用户录入界面提交保存用户信息
		else if ("addsave".equals(action)) {
			addsave(req, resp);
		}else if ("delete".equals(action)) {
			delete(req, resp);
		} 
	}

	private void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			Integer leaveId=Integer.valueOf(req.getParameter("leaveId"));
			activityService.delete(leaveId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("activity.do?action=list");
	}

	private void addsave(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Activity activity = new Activity();
			activity.setLeaveId(Integer.valueOf(req.getParameter("leaveId")));
			activity.setEmployeeId(req.getParameter("employeeId"));
			activity.setEmployeeName(req.getParameter("employeeName"));
			activity.setMonth(sdf.parse(req.getParameter("month")));
			activity.setStartTime(Integer.valueOf(req.getParameter("startTime")));
			activity.setDay(Integer.valueOf(req.getParameter("day")));
			activity.setReason(Integer.valueOf(req.getParameter("reason")));
			activity.setApprovePersion(req.getParameter("approvePersion"));
			activityService.add(activity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("activity.do?action=list");
		
	}

	private void addview(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.sendRedirect("activityAdd.jsp");
		
	}

	@SuppressWarnings("unused")
	public void editsave(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Activity activity = new Activity();
			activity.setLeaveId(Integer.valueOf(req.getParameter("leaveId")));
			activity.setEmployeeId(req.getParameter("employeeId"));
			activity.setEmployeeName(req.getParameter("employeeName"));
			activity.setMonth(sdf.parse(req.getParameter("month")));
			activity.setStartTime(Integer.valueOf(req.getParameter("startTime")));
			activity.setDay(Integer.valueOf(req.getParameter("day")));
			activity.setReason(Integer.valueOf(req.getParameter("reason")));
			activity.setApprovePersion(req.getParameter("approvePersion"));
			activityService.edit(activity);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("activity.do?action=list");
		
	}

	private void editview(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Activity activity = activityService.get(Integer.parseInt(req.getParameter("leaveId")));
			req.setAttribute("activity", activity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("activityEdit.jsp").forward(req, resp);
	
	}

	private void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<Activity> activityList = activityService.list();
			req.setAttribute("activityList", activityList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.getRequestDispatcher("activityList.jsp").forward(req, resp);
	}
		
	
}
