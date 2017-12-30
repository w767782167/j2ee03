package com.etcxm.service.impl;

import java.util.List;

import lombok.Setter;

import com.etcxm.dao.IEmployeeDao;
import com.etcxm.domain.Employee;
import com.etcxm.service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {

	@Setter
	private IEmployeeDao dao;
	
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		dao.save(emp);
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		dao.update(emp);
	}

	@Override
	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		dao.delete(emp);
	}

	@Override
	public Employee get(Long id) {
		// TODO Auto-generated method stub
		return dao.get(id);
	}

	@Override
	public List<Employee> ListAll() {
		// TODO Auto-generated method stub
		return dao.ListAll();
	}

}
