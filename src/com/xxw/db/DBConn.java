package com.xxw.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConn {

	//数据库连接字符串
	static String url="jdbc:mysql://localhost:3306/gd01";
	static String uid = "root";
	static String pwd = "";
	static String driverClassName = "com.mysql.jdbc.Driver";
	
	static{
		try {
			Class.forName(driverClassName);						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * 获得数据库连接对象
	 * @return 连接成功返回Connection对象，连接失败返回null
	 */
	public static Connection getConnection(){
		try {
			Connection conn = DriverManager.getConnection(url, uid, pwd);
			//System.out.println("数据库连接成功！");
			return conn;
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void closeConnection(Connection conn){
		try {
			if(conn!=null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static  void exeSQL(String sql) throws Exception{
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		closeConnection(conn);
	}
	public static void main(String[] args) {
		getConnection();
	}
}
