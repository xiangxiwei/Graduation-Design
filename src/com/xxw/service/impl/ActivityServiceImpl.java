package com.xxw.service.impl;

import java.util.List;

import com.xxw.dao.ActivityDao;
import com.xxw.dao.impl.ActivityDaoImpl;
import com.xxw.entity.Activity;
import com.xxw.service.ActivityService;

public class ActivityServiceImpl implements ActivityService {
private ActivityDao acticityDao = new ActivityDaoImpl();
	@Override
	public void add(Activity activity) throws Exception {
		acticityDao.add(activity);

	}

	@Override
	public void edit(Activity activity) throws Exception {
		acticityDao.edit(activity);

	}

	@Override
	public void delete(int id) throws Exception {
		acticityDao.delete(id);

	}

	@Override
	public List<Activity> list() {
		return acticityDao.list();
	}

	@Override
	public Activity get(int id) {
		return acticityDao.get(id);
	}

}
