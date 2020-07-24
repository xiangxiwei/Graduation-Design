package com.xxw.service;

import java.util.List;
import com.xxw.entity.User;

public interface UserService {
	// 添加用户
	void add(User user) throws Exception;

	// 修改用户
	void edit(User user) throws Exception;;

	// 删除用户
	void delete(int id) throws Exception;

	// 查询所有用户
	List<User> list();
	// 根据id查询查询指定用户
	User get(int id);
}
