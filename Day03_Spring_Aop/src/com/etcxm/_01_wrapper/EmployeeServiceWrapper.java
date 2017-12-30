package com.etcxm._01_wrapper;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.ectxm.common.TransactionManager;
import com.ectxm.common.domain.Employee;
import com.ectxm.common.service.IEmployeeService;

@AllArgsConstructor
@NoArgsConstructor
public class EmployeeServiceWrapper implements IEmployeeService {

	private IEmployeeService target;//包含一个真实的对象
	
	private TransactionManager manager; //事务管理器
	
	
	
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
