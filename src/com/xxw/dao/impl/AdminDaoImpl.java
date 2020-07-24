package com.xxw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.xxw.dao.AdminDao;
import com.xxw.db.DBConn;
import com.xxw.entity.Admin;

public class AdminDaoImpl implements AdminDao{

//	@Override
//	public Admin get(int id) throws SQLException{
//		String sql = "select id,AdminName,password from Admin_info where id=?";
//		Connection conn = null;
//		Admin admin = null;
//		
//			conn = DBConn.getConnection();
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, id);
//
//			ResultSet rs = pstmt.executeQuery();
//			if (rs.next()) {
//				
//				String AdminName = rs.getString(2);
//				String password = rs.getString(3);
//
//				admin = new Admin();
//				admin.setId(id);
//				admin.setAdminName(AdminName);
//				admin.setPassword(password);
//		
//	}
//			return admin;
//	}

//	@Override
//	public Admin selectById(Serializable adminId) {
//		String sql = "select * from Admin_info where AdminName=?";
//		Connection conn = null;
//		try {
//			conn = DBConn.getConnection();
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setObject(1, adminId);
//			ResultSet rs = ps.executeQuery();
//			while (rs.next()) {
//				Admin admin = new Admin();
//				admin.setId(rs.getInt("id"));
//				admin.setAdminName(rs.getString("AdminName"));
//				admin.setPassword(rs.getString("password"));
//				return  admin;
//				
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			DBConn.closeConnection(conn);
//		}
//		return null;
//	}

	@Override
	public void add(Admin admin) throws Exception {
		String sql="INSERT Admin_info(AdminName,password) values(?,?)";
		Connection conn = null;
		try{
			conn = DBConn.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,admin.getAdminName());
			ps.setString(2,admin.getPassword());
			int  n = ps.executeUpdate();
			if(n!=1){
				throw new Exception("插入用户失败");
			}		
		}catch(Exception ex){
			ex.printStackTrace();
			throw new Exception("插入用户失败:"+ex.getMessage());
		}finally{
			DBConn.closeConnection(conn);
		}
		
	}

//	@Override
//	public Admin index(String AdminName, String password) throws Exception {
//		Admin admin;
//		AdminDao dao=new AdminDaoImpl();
//		try {
//			admin = dao.selectByName(AdminName);
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new Exception("用户不存在");
//		}
//		return admin;
//	}

	@Override
	public Admin selectByName(String AdminName) {
		String sql = "select * from Admin_info where AdminName=?";
		Connection conn = null;
		Admin admin = null;
		try {
			conn = DBConn.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, AdminName);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				admin = new Admin();
				admin.setId(rs.getInt("id"));
				admin.setAdminName(rs.getString("AdminName"));
				admin.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConn.closeConnection(conn);
		}
		return admin;
	}

	@Override
	public void edit(Admin admin) throws Exception {
		Connection conn= null;
		try {
			conn = DBConn.getConnection();
			String sql = "update admin_info set AdminName=?,password=? where id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, admin.getAdminName());
			ps.setString(2, admin.getPassword());
			int n =ps.executeUpdate();
			if(n!=1) {
				throw new Exception("修改密码失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBConn.closeConnection(conn);
		}
		
	}
}
