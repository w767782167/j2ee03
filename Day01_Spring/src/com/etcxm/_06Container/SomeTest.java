package com.etcxm._06Container;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration*/

public class SomeTest {
	
	//BeanFactory
	/*@Test
	public void testBeanfactory(){
		Resource resource = new ClassPathResource("com/etcxm/_06Container/SomeTest-context.xml");
	    BeanFactory factory = new XmlBeanFactory(resource);
	    System.out.println("++++++++++++++++++++++++++");
	    SomeBean bean = factory.getBean("Somebean", SomeBean.class);
	    System.out.println(bean);
	}*/
	
	
	
	//ApplicationContext
	@Test
	public void testApplicationContext(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/etcxm/_06Container/SomeTest-context.xml");
		System.out.println("++++++++++++++++++++++++++");
		SomeBean bean = ctx.getBean("Somebean", SomeBean.class);
		System.out.println("ApplicationContext");
		System.out.println(bean);
	}
	
	/*@Autowired
	private BeanFactory factory;
	
	@Autowired
	private ApplicationContext ctx; 
	
	@Autowired
	private SomeBean bean2;
	
	@Test
	public void test1() {
		SomeBean bean = factory.getBean("Somebean", SomeBean.class);
		System.out.println(bean);
		
		System.out.println("------------------------------------");
		
		SomeBean bean1 = ctx.getBean("Somebean", SomeBean.class);
		System.out.println(bean1);
		
		System.out.println(bean2);
	}*/
	
	
	

}
