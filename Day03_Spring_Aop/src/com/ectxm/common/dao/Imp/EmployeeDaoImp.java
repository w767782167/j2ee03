package com.ectxm.common.dao.Imp;

import com.ectxm.common.dao.IEmployeeDao;
import com.ectxm.common.domain.Employee;

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
