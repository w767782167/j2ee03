package com.etcxm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etcxm.domain.Employee;
import com.etcxm.service.IEmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceImplTest {

	@Autowired
	private IEmployeeService service;
	@Test
	public void testSave() {
		Employee emp = new Employee();
		emp.setName("jack");
		emp.setAge(30);
		service.save(emp);
	}

	@Test
	public void testUpdate() {
		Employee emp = new Employee();
		emp.setName("tom");
		emp.setAge(10);
		emp.setId(3L);
		service.update(emp);
	}

	@Test
	public void testDelete() {
		Employee emp = new Employee();
		emp.setName("tom");
		emp.setAge(10);
		emp.setId(3L);
		service.delete(emp);
	}

	@Test
	public void testGet() {
		Employee employee = service.get(1L);
		System.out.println(employee);
	}

	@Test
	public void testListAll() {
		List<Employee> list = service.ListAll();
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

}
