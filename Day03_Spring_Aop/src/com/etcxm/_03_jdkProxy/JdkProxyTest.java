package com.etcxm._03_jdkProxy;

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

public class JdkProxyTest {
	
	@Autowired
	@Qualifier("transcationManagerHandler")
	private TranscationManagerHandler handler;
	
	@Test
	public void testSave(){
		//获取代理对象
		IEmployeeService service =(IEmployeeService)handler.getProxyObject();
		service.save(new Employee());
	}
	
	/*@Test
	public void testUpdate(){
		IEmployeeService service =(IEmployeeService)handler.getProxyObject();
		service.update(new Employee());
	}*/
	
	
	
	

}
