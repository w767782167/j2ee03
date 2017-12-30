package com.etcxm._01_wrapper;

import org.junit.Test;

import com.ectxm.common.TransactionManager;
import com.ectxm.common.domain.Employee;
import com.ectxm.common.service.Imp.EmployeeServiceImp;

public class AppTest {
	
	@Test
	public void	 test1() {
		EmployeeServiceWrapper wrapper = new EmployeeServiceWrapper(
				new EmployeeServiceImp(),new TransactionManager());
		//wrapper.save(new Employee());
		wrapper.update(new Employee());
	}

}
