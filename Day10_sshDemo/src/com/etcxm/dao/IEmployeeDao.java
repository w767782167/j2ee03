package com.etcxm.dao;

import java.util.List;

import com.etcxm.domain.Employee;

public interface IEmployeeDao {
   public void save(Employee emp);
   public void update(Employee emp);
   public void delete(Employee emp);
   public Employee get(Long id);
   public List<Employee> ListAll();
}
