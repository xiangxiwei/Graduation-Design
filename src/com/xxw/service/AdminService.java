package com.xxw.service;

import com.xxw.entity.Admin;

public interface AdminService {
	//验证用户名跟密码登录系统
	boolean isLogain(String AdminName,String password) throws Exception;
	// 注册管理员
	void add(Admin admin) throws Exception;
	//修改管理员信息
	void edit(Admin admin) throws Exception;
}
