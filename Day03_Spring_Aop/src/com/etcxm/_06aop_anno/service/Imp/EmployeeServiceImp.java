package com.etcxm._06aop_anno.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etcxm._06aop_anno.dao.IEmployeeDao;
import com.etcxm._06aop_anno.domain.Employee;
import com.etcxm._06aop_anno.service.IEmployeeService;

import lombok.Setter;


//<bean id="employeeService" class="com.ectxm.common.service.Imp.EmployeeServiceImp">
@Service("employeeService")
public class EmployeeServiceImp implements IEmployeeService{

	@Autowired
	@Qualifier("employeeDao")
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
