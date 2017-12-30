package com.etcxm._05aop_xml;

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

import com.ectxm.common.domain.Employee;
import com.ectxm.common.service.IEmployeeService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class AopbyXmlTest {
	
	@Autowired
	private IEmployeeService service; 
	
	@Test
	public void testSave(){
		service.save(new Employee());
	}
	
	/*@Test
	public void testUpdate(){
		service.update(new Employee());
	}*/
	
	
	
	

}
