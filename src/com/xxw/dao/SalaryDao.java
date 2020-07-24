package com.xxw.dao;

import java.util.List;
import com.xxw.entity.Salary;
import com.xxw.entity.User;

public interface SalaryDao {
	void add(Salary salary) throws Exception;
	void edit(Salary salary) throws Exception;
	void delete(int id) throws Exception;
	List<Salary> list();
	Salary get(int id);
}
