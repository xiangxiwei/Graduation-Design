package com.xxw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.geom.transform.GeneralTransform3D;
import com.xxw.dao.ActivityDao;
import com.xxw.db.DBConn;
import com.xxw.entity.Activity;
import com.xxw.entity.Salary;

public class ActivityDaoImpl implements ActivityDao {

	@Override
	public void add(Activity activity) throws Exception {
		String sql = "insert into activity_info(leaveId,employeeId,employeeName,month,startTime,day,reason,approvePersion) values(?,?,?,?,?,?,?,?)";
		Connection conn = null;
		conn = DBConn.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, activity.getLeaveId());
			ps.setString(2, activity.getEmployeeId());
			ps.setString(3, activity.getEmployeeName());
			ps.setObject(4, activity.getMonth());
			ps.setInt(5, activity.getStartTime());
			ps.setInt(6, activity.getDay());
			ps.setInt(7, activity.getReason());
			ps.setString(8, activity.getApprovePersion());
			int n = ps.executeUpdate();
			if (n != 1) {
				throw new Exception("添加活动失败");
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("添加活动失败" + e.getMessage());
		} finally {
			DBConn.closeConnection(conn);
		}
	}

	@Override
	public void edit(Activity activity) throws Exception {
		Connection conn = null;
		
		try {
			String sql = "update activity_info set leaveId=?,employeeId=?,employeeName=?,month=?,startTime=?,day=?,reason=?,approvePersion=? where leaveId=?";
			conn = DBConn.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, activity.getLeaveId());
			ps.setString(2, activity.getEmployeeId());
			ps.setString(3, activity.getEmployeeName());
			ps.setObject(4, activity.getMonth());
			ps.setInt(5, activity.getStartTime());
			ps.setInt(6, activity.getDay());
			ps.setInt(7, activity.getReason());
			ps.setString(8, activity.getApprovePersion());
			ps.setInt(9, activity.getLeaveId());
			int n = ps.executeUpdate();
			if (n != 1) {
				throw new Exception("修改活动失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("修改活动失败" + e.getMessage());
		} finally {
			DBConn.closeConnection(conn);
		}
	}

	@Override
	public void delete(int id) throws Exception {
		Connection conn = null;

		try {
			String sql = "delete from activity_info where leaveId=?";
			conn = DBConn.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int n = ps.executeUpdate();
			if (n != 1) {
				throw new Exception("删除活动失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("删除活动失败:" + e.getMessage());
		} finally {
			DBConn.closeConnection(conn);
		}

	}

	@Override
	public List<Activity> list() {
		List<Activity> list = new ArrayList<Activity>();
		String sql = "select * from activity_info";
		Connection conn = null;
		try {
			conn = DBConn.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Activity activity = new Activity();
				activity.setLeaveId(rs.getInt(1));
				activity.setEmployeeId(rs.getString(2));
				activity.setEmployeeName(rs.getString(3));
				activity.setMonth(rs.getDate(4));
				activity.setStartTime(rs.getInt(5));
				activity.setDay(rs.getInt(6));
				activity.setReason(rs.getInt(7));
				activity.setApprovePersion(rs.getString(8));
				list.add(activity);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConn.closeConnection(conn);
		}
		return list;
	}

	@Override
	public Activity get(int id) {
		Connection conn = null;
		conn = DBConn.getConnection();
		String sql = "select leaveId,employeeId,employeeName,month,startTime,day,reason,approvePersion from activity_info where leaveId=?";
		Activity activity = new Activity();
		try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					activity.setLeaveId(rs.getInt(1));
					activity.setEmployeeId(rs.getString(2));
					activity.setEmployeeName(rs.getString(3));
					activity.setMonth(rs.getDate(4));
					activity.setStartTime(rs.getInt(5));
					activity.setDay(rs.getInt(6));
					activity.setReason(rs.getInt(7));
					activity.setApprovePersion(rs.getString(8));
				
				}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBConn.closeConnection(conn);
		}
		return activity;
	}

}
