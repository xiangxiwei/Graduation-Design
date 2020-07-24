package com.xxw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.xxw.dao.UserDao;
import com.xxw.db.DBConn;
import com.xxw.entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void add(User user) throws Exception {
		String sql = "INSERT into user_info(employeeId,name,cardNumber,nation,sex,birthday,graduateSchool,schoolRecord,department,telephone,positionName) values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		try {
			conn = DBConn.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, user.getEmployeeId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getCardNumber());
			ps.setString(4, user.getNation());
			ps.setString(5, user.getSex());
			ps.setObject(6, user.getBirthday());
			ps.setString(7, user.getGraduateSchool());
			ps.setString(8, user.getSchoolRecord());
			ps.setString(9, user.getDepartment());
			ps.setString(10, user.getTelephone());
			ps.setString(11, user.getPositionName());

			int n = ps.executeUpdate();
			if (n != 1) {
				throw new Exception("插入用户失败");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception("插入用户失败:" + ex.getMessage());
		} finally {
			DBConn.closeConnection(conn);
		}

	}

	@Override
	public void edit(User user) throws Exception {
		Connection conn = null;
		try {
			conn = DBConn.getConnection();
			String sql = "update user_info set employeeId=?,name=?,cardNumber=?,nation=?,sex=?,birthday=?,graduateSchool=?,schoolRecord=?,department=?,telephone=?,positionName=? where employeeId=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, user.getEmployeeId());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getCardNumber());
			pstmt.setString(4, user.getNation());
			pstmt.setString(5, user.getSex());
			pstmt.setObject(6, user.getBirthday());
			pstmt.setString(7, user.getGraduateSchool());
			pstmt.setString(8, user.getSchoolRecord());
			pstmt.setString(9, user.getDepartment());
			pstmt.setString(10, user.getTelephone());
			pstmt.setString(11, user.getPositionName());
			pstmt.setInt(12, user.getEmployeeId());
			int n = pstmt.executeUpdate();
			if (n != 1) {
				throw new Exception("修改用户失败");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception("修改用户失败:" + ex.getMessage(),ex);
		} finally {
			DBConn.closeConnection(conn);
		}

	}

	@Override
	public void delete(int id) throws Exception {
		Connection conn = null;
		try {
			conn = DBConn.getConnection();
			String sql = "delete from user_info where employeeId=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int n = ps.executeUpdate();
			if (n != 1) {
				throw new Exception("删除用户失败");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception("删除用户失败:" + ex.getMessage());
		} finally {
			DBConn.closeConnection(conn);
		}

	}

	@Override
	public List<User> list() {
		List<User> list = new ArrayList<User>();
		String sql = "select * from user_info";
		Connection conn = null;
		try {
			conn = DBConn.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int employeeId = rs.getInt(1);
				String name = rs.getString(2);
				String cardNumber = rs.getString(3);
				String nation = rs.getString(4);
				String sex = rs.getString(5);
				Date birthday = rs.getDate(6);
				String graduateSchool = rs.getString(7);
				String schoolRecord = rs.getString(8);
				String department = rs.getString(9);
				String telephone = rs.getString(10);
				String positionName = rs.getString(11);

				User user = new User();
				user.setEmployeeId(employeeId);
				user.setName(name);

				user.setCardNumber(cardNumber);
				user.setNation(nation);
				user.setSex(sex);
				user.setBirthday(birthday);
				user.setGraduateSchool(graduateSchool);
				user.setSchoolRecord(schoolRecord);
				user.setDepartment(department);
				user.setTelephone(telephone);
				user.setPositionName(positionName);

				list.add(user);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConn.closeConnection(conn);
		}
		return list;
	}

	@Override
	public User get(int id) {
		String sql = "select employeeId,name,cardNumber,nation,sex,birthday,graduateSchool,schoolRecord,department,telephone,positionName from user_info where employeeId=?";
		Connection conn = null;
		User user = new User();
		try {
			conn = DBConn.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()){
				String name = rs.getString(2);
				String cardNumber = rs.getString(3);
				String nation = rs.getString(4);
				String sex = rs.getString(5);
				Date birthday = rs.getDate(6);
				String graduateSchool = rs.getString(7);
				String schoolRecord = rs.getString(8);
				String department = rs.getString(9);
				String telephone = rs.getString(10);
				String positionName = rs.getString(11);
				user = new User();
				user.setEmployeeId(id);
				user.setName(name);
				user.setCardNumber(cardNumber);
				user.setNation(nation);
				user.setSex(sex);
				user.setBirthday(birthday);
				user.setGraduateSchool(graduateSchool);
				user.setSchoolRecord(schoolRecord);
				user.setDepartment(department);
				user.setTelephone(telephone);
				user.setPositionName(positionName);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBConn.closeConnection(conn);
		}
		return user;
	}

}
