package com.xxw.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import com.xxw.entity.Admin;

public interface AdminDao {
	//Admin get(int id) throws SQLException;
	
	//根据参数用户名来查询数据
	Admin selectByName(String AdminName);
	// 添加用户
	void add(Admin admin) throws Exception;
	
	void edit(Admin admin) throws Exception;
//	Admin index(String AdminName,String password) throws Exception;
		
}
