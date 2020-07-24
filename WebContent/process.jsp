
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	
	request.setCharacterEncoding("utf-8");
	
	String AdminName = request.getParameter("AdminName");
	String password = request.getParameter("password");
	
	if("admin".equals(AdminName) && "000".equals(password)){
		session.setAttribute("AdminName", AdminName);
		request.getRequestDispatcher("show.jsp").forward(request, response);
	}
	else{
		response.sendRedirect("index.jsp");
	}
%>