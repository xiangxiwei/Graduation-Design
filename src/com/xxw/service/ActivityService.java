package com.xxw.service;

import java.util.List;

import com.xxw.entity.Activity;

public interface ActivityService {
	void add(Activity activity) throws Exception;
	void edit(Activity activity) throws Exception;
	void delete(int id) throws Exception;
	List<Activity> list();
	Activity get(int id);
}
