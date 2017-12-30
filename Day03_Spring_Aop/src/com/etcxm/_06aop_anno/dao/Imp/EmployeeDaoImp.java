package com.etcxm._06aop_anno.dao.Imp;

import org.springframework.stereotype.Repository;

import com.etcxm._06aop_anno.dao.IEmployeeDao;
import com.etcxm._06aop_anno.domain.Employee;

//<!-- 配置dao -->
//<bean id="employeeDao" class="com.ectxm.common.dao.Imp.EmployeeDaoImp"></bean>

@Repository("employeeDao")
public class EmployeeDaoImp implements IEmployeeDao {

	@Override
	public void save(Employee emp) {
		System.out.println("dao保存员工");
		
	}

	@Override
	public void update(Employee emp) {
		//System.out.println("dao修改员工");
		throw new RuntimeException("故意出错");
	}

}
