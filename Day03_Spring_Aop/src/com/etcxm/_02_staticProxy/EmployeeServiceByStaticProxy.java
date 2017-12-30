package com.etcxm._02_staticProxy;

import lombok.Setter;

import com.ectxm.common.TransactionManager;
import com.ectxm.common.domain.Employee;
import com.ectxm.common.service.IEmployeeService;

public class EmployeeServiceByStaticProxy implements IEmployeeService {

	@Setter
	private IEmployeeService target;//真实对象
	
	@Setter
	private TransactionManager manager;
	
	@Override
	public void save(Employee emp) {
		manager.begin();
		try {
			target.save(emp);
			manager.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			manager.rollback();
		}
	}

	@Override
	public void update(Employee emp) {
		manager.begin();
		try {
			target.update(emp);
			manager.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			manager.rollback();
		}
		
	}

}
