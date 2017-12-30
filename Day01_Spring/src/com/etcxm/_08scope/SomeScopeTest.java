package com.etcxm._08scope;

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




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class SomeScopeTest {
	
	@Autowired
	private ApplicationContext ctx;
	
	//①.构造器实例化（无参数构造器），最标准，使用最多。
	@Test
	public void test1(){
		SomeBean bean = ctx.getBean("SomeBean", SomeBean.class);
		SomeBean bean1 = ctx.getBean("SomeBean", SomeBean.class);
		bean.doWork();
		//System.out.println(bean);
		//System.out.println(bean1);
	}
	
	
	
	

}
