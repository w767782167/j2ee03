package com.ectxm.common.service;

import com.ectxm.common.domain.Employee;

public interface IEmployeeService {
	
    public void save(Employee emp);
	
	public void update(Employee emp);
}
