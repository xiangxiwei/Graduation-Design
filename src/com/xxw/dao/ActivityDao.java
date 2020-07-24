package com.xxw.dao;

import java.util.List;

import com.xxw.entity.Activity;

public interface ActivityDao {
	void add(Activity activity) throws Exception;
	void edit(Activity activity) throws Exception;
	void delete(int id) throws Exception;
	List<Activity> list();
	Activity get(int id);
}
