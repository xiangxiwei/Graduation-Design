package com.xxw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.xxw.dao.SalaryDao;
import com.xxw.db.DBConn;
import com.xxw.entity.Salary;

public class SalaryDaoImpl implements SalaryDao {

	@Override
	public void add(Salary salary) throws Exception {
		String sql = "insert into salary_info(salaryId,employeeId,name,year,month,basicWage,overtimeWage,trafficWage,totalWage,kaoqinReduce,secureReduce,taxReduce,totalReduce,realWage) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		try {
			conn = DBConn.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, salary.getSalaryId());
			ps.setString(2, salary.getEmployeeId());
			ps.setString(3, salary.getName());
			ps.setInt(4, salary.getYear());
			ps.setInt(5, salary.getMonth());
			ps.setString(6, salary.getBasicWage());
			ps.setString(7, salary.getOvertimeWage());
			ps.setString(8, salary.getTrafficWage());
			ps.setString(9, salary.getTotalWage());
			ps.setString(10, salary.getKaoqinReduce());
			ps.setString(11, salary.getSecureReduce());
			ps.setString(12, salary.getTaxReduce());
			ps.setString(13, salary.getTotalReduce());
			ps.setString(14, salary.getRealWage());
			int n = ps.executeUpdate();
			if (n != 1) {
				throw new Exception("插入工资失败");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("插入工资失败：" + e.getMessage());
		} finally {
			DBConn.closeConnection(conn);
		}

	}

	@Override
	public void edit(Salary salary) throws Exception {
		Connection conn = null;
		try {
			conn = DBConn.getConnection();
			String sql = "update salary_info set salaryId=?,employeeId=?,name=?,year=?,month=?,basicWage=?,overtimeWage=?,trafficWage=?,totalWage=?,kaoqinReduce=?,secureReduce=?,taxReduce=?,totalReduce=?,realWage=? where salaryId=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, salary.getSalaryId());
			ps.setString(2, salary.getEmployeeId());
			ps.setString(3, salary.getName());
			ps.setInt(4, salary.getYear());
			ps.setInt(5, salary.getMonth());
			ps.setString(6, salary.getBasicWage());
			ps.setString(7, salary.getOvertimeWage());
			ps.setString(8, salary.getTrafficWage());
			ps.setString(9, salary.getTotalWage());
			ps.setString(10, salary.getKaoqinReduce());
			ps.setString(11, salary.getSecureReduce());
			ps.setString(12, salary.getTaxReduce());
			ps.setString(13, salary.getTotalReduce());
			ps.setString(14, salary.getRealWage());
			ps.setInt(15,salary.getSalaryId());
			int n = ps.executeUpdate();
			if (n != 1) {
				throw new Exception("修改工资失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("修改工资失败" + e.getMessage());
		} finally {
			DBConn.closeConnection(conn);
		}
	}

	@Override
	public void delete(int id) throws Exception {
		Connection conn = null;
		try {
			conn = DBConn.getConnection();
			String sql = "delete from salary_info where salaryId=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int n = ps.executeUpdate();
			if (n != 1) {
				throw new Exception("删除工资失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("删除工资失败:" + e.getMessage());
		} finally {
			DBConn.closeConnection(conn);
		}

	}

	@Override
	public List<Salary> list() {
		List<Salary> list = new ArrayList<Salary>();
		//String sql = "select salaryId,employeeId,name,year,month,basicWage,overtimeWage,trafficWage,totalWage,kaoqinReduce,secureReduce,taxReduce,totalReduce,realWage from salary_info";
		String sql ="select * from salary_info";
		Connection conn = null;
		try {
			conn = DBConn.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Salary salary = new Salary();
				salary.setSalaryId(rs.getInt(1));
				salary.setEmployeeId(rs.getString(2));
				salary.setName(rs.getString(3));
				salary.setYear(rs.getInt(4));
				salary.setMonth(rs.getInt(5));
				salary.setBasicWage(rs.getString(6));
				salary.setOvertimeWage(rs.getString(7));
				salary.setTrafficWage(rs.getString(8));
				salary.setTotalWage(rs.getString(9));
				salary.setKaoqinReduce(rs.getString(10));
				salary.setSecureReduce(rs.getString(11));
				salary.setTaxReduce(rs.getString(12));
				salary.setTotalReduce(rs.getString(13));
				salary.setRealWage(rs.getString(14));
				
				list.add(salary);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConn.closeConnection(conn);
		}
		return list;
	}

	@Override
	public Salary get(int id) {
		Connection conn = null;
		conn = DBConn.getConnection();
		String sql = "select salaryId,employeeId,name,year,month,basicWage,overtimeWage,trafficWage,totalWage,kaoqinReduce,secureReduce,taxReduce,totalReduce,realWage from salary_info where salaryId=?";
		Salary salary = new Salary();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				salary.setSalaryId(rs.getInt(1));
				salary.setEmployeeId(rs.getString(2));
				salary.setName(rs.getString(3));
				salary.setYear(rs.getInt(4));
				salary.setMonth(rs.getInt(5));
				salary.setBasicWage(rs.getString(6));
				salary.setOvertimeWage(rs.getString(7));
				salary.setTrafficWage(rs.getString(8));
				salary.setTotalWage(rs.getString(9));
				salary.setKaoqinReduce(rs.getString(10));
				salary.setSecureReduce(rs.getString(11));
				salary.setTaxReduce(rs.getString(12));
				salary.setTotalReduce(rs.getString(13));
				salary.setRealWage(rs.getString(14));
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.closeConnection(conn);
		}
		return salary;
	}

}
