package com.etcxm._06aop_anno;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.etcxm._06aop_anno.domain.Employee;
import com.etcxm._06aop_anno.service.IEmployeeService;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class AopbyAnnoTest {
	
	@Autowired
	@Qualifier("employeeService")
	private IEmployeeService service; 
	
	@Test
	public void testSave(){
		//System.out.println(service);
		service.save(new Employee());
	}
	
	/*@Test
	public void testUpdate(){
		service.update(new Employee());
	}*/
	
	
	
	

}
