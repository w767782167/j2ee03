package com.ectxm.common.service.Imp;

import lombok.Setter;

import com.ectxm.common.TransactionManager;
import com.ectxm.common.dao.IEmployeeDao;
import com.ectxm.common.dao.Imp.EmployeeDaoImp;
import com.ectxm.common.domain.Employee;
import com.ectxm.common.service.IEmployeeService;

public class EmployeeServiceImp implements IEmployeeService{

	@Setter
	private IEmployeeDao dao;
	
//	private TransactionManager  manager;
	
	@Override
	public void save(Employee emp) {

		dao.save(emp);

	}

	@Override
	public void update(Employee emp) {

		dao.update(emp);

	}
	
	
	/*public void query(){
		
	}*/

}
