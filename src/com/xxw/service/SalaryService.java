package com.xxw.service;

import java.util.List;

import com.xxw.entity.Salary;

public interface SalaryService {
	void add(Salary salary) throws Exception;
	void edit(Salary salary) throws Exception;
	void delete(int id) throws Exception;
	List<Salary> list();
	Salary get(int id);
}
