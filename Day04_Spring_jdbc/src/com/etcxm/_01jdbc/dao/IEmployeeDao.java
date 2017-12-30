package com.etcxm._01jdbc.dao;

import java.util.List;

import com.etcxm._01jdbc.domain.Employee;

public interface IEmployeeDao {
   public void save(Employee emp);
   public void update(Employee emp);
   public void delete(Long id);
   public Employee get(Long id);
   public List<Employee> getAll();
}
