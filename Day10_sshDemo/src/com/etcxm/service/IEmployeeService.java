package com.etcxm.service;

import java.util.List;

import com.etcxm.domain.Employee;

public interface IEmployeeService {
   public void save(Employee emp);
   public void update(Employee emp);
   public void delete(Employee emp);
   public Employee get(Long id);
   public List<Employee> ListAll();
}
