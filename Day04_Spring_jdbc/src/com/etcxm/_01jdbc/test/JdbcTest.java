package com.etcxm._01jdbc.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etcxm._01jdbc.dao.IEmployeeDao;
import com.etcxm._01jdbc.dao.Imp.EmployeeDaoImp;
import com.etcxm._01jdbc.domain.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class JdbcTest {	
	
	@Autowired
	private IEmployeeDao dao;
	
	@Test
	public void testSave(){
		//System.out.println(dao);
		//IEmployeeDao dao = ctx.getBean(EmployeeDaoImp.class);
		Employee emp = new Employee();
		emp.setAge(11);
		emp.setName("rose123");
		dao.save(emp);
	}
	
	@Test
	public void testUpdate(){
		//IEmployeeDao dao = ctx.getBean(EmployeeDaoImp.class);
		Employee emp = new Employee();
		emp.setAge(50);
		emp.setName("张三");
		emp.setId(2L);
		dao.update(emp);
	}
	
	@Test
	public void testDelete(){
		dao.delete(3L);
	}
	
	@Test
	public void testGetone(){
		Employee emp = dao.get(1L);
		System.out.println(emp);
	}
	
	@Test
	public void testGetall(){
		List<Employee> list = dao.getAll();
		System.out.println(list);
	}


}
