package com.ectxm.common.dao;

import com.ectxm.common.domain.Employee;

public interface IEmployeeDao {
	
	public void save(Employee emp);
	
	public void update(Employee emp);

}
