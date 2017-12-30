package com.etcxm.service.impl;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etcxm.domain.TEmployee;
import com.etcxm.service.IEmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class EmployeeServiceImplTest {

	@Autowired
	IEmployeeService service;
	
	@Test
	public void testSave() {
		System.out.println(service);
		TEmployee emp = new TEmployee();
		emp.setUsername("admin1");
		emp.setRealname("rose1");
		emp.setEmail("123@qq.com");
		emp.setTel("13800000001");
		emp.setInputtime(new Date());
		emp.setPassword("667");
		emp.setState(true);
		emp.setAdmin(false);
		
		service.save(emp);
		
	}

	@Test
	public void testUpdate() {
		
	}

	@Test
	public void testDelete() {
		
	}

	@Test
	public void testGetOne() {
		
	}

	@Test
	public void testList() {
		
	}

}
