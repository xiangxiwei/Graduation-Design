package com.xxw.test;

import org.junit.Test;

import com.sun.net.httpserver.HttpServer;
import com.xxw.dao.ActivityDao;
import com.xxw.dao.impl.ActivityDaoImpl;
import com.xxw.dao.impl.UserDaoImpl;
import com.xxw.db.DBConn;
import com.xxw.entity.Activity;
import com.xxw.entity.User;
import com.xxw.service.impl.UserServiceImpl;
import com.xxw.servlet.ActivityServlet;
import com.xxw.servlet.SalaryServlet;
import com.xxw.servlet.UserServlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class test extends HttpServlet{
	@Test
	public void test() throws Exception{
//		User user = new User();
//		user.setEmployeeId(123132);
//		user.setName("adadadad");
//		user.setDepartment("研发部");
//		user.setTelephone("11327444");
//		try {
//			new UserServiceImpl().add(user);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		UserDaoImpl i = new UserDaoImpl();
//		i.get(25);
		Activity activity = new Activity();
		ActivityDao s = new ActivityDaoImpl();
		HttpServletRequest req = null;
		HttpServletResponse resp = null;
		String sql = "update activity_info set leaveId=?,employeeId=?,employeeName=?,month=?,startTime=?,day=?,reason=?,approvePersion=? where leaveId=?";
		Connection conn = DBConn.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		//s.edit(activity.getLeaveId());
		
		
	}

	

//<link rel="stylesheet" href="css/zui.min.css">
//<script src="js/jquery.min.js"></script>
//<script src="js/zui.min.js"></script>
	
	
//	<from action="user.do?action=userList" method="post">
//	<div align="center">
//		<input id="inputAccountExample2" type="text" class="form-control"
//			placeholder="请输入姓名" style="width: 200px"> <input
//			type="submit" value="查找" />
//	</div>
//	</from>

}
