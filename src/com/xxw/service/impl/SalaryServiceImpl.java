package com.xxw.service.impl;

import java.util.List;

import com.xxw.dao.SalaryDao;
import com.xxw.dao.impl.SalaryDaoImpl;
import com.xxw.entity.Salary;
import com.xxw.service.SalaryService;

public class SalaryServiceImpl implements SalaryService {
private SalaryDao salaryDao = new SalaryDaoImpl();
	@Override
	public void add(Salary salary) throws Exception {
		salaryDao.add(salary);

	}

	@Override
	public void edit(Salary salary) throws Exception {
		salaryDao.edit(salary);

	}

	@Override
	public void delete(int id) throws Exception {
		salaryDao.delete(id);

	}

	@Override
	public List<Salary> list() {
		return salaryDao.list();
	}

	@Override
	public Salary get(int id) {
		return salaryDao.get(id);
	}

}
