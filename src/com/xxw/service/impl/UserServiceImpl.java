package com.xxw.service.impl;

import java.util.List;

import com.xxw.dao.UserDao;
import com.xxw.dao.impl.UserDaoImpl;
import com.xxw.entity.User;
import com.xxw.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public void add(User user) throws Exception {
		userDao.add(user);
	}

	@Override
	public void edit(User user) throws Exception {
		userDao.edit(user);
	}

	@Override
	public void delete(int id) throws Exception {
		userDao.delete(id);
	}

	@Override
	public List<User> list() {
		return userDao.list();
	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}
}
