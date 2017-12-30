package com.etcxm._07Created;

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

import com.etcxm._07Created._01.SomeBean1;
import com.etcxm._07Created._02.SomeBean2;
import com.etcxm._07Created._02.SomeBean2Factory;
import com.etcxm._07Created._03.SomeBean3;
import com.etcxm._07Created._03.SomeBean3Factory;
import com.etcxm._07Created._04.SomeBean4;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class SomeCreateTest {
	
	@Autowired
	private ApplicationContext ctx;
	
	//①.构造器实例化（无参数构造器），最标准，使用最多。
	/*@Test
	public void test1(){
		SomeBean1 bean = ctx.getBean("Somebean1", SomeBean1.class);
		System.out.println(bean);
	}*/
	
	
	//②.静态工厂方法实例化：解决系统遗留问题
	/*@Test
	public void test2(){
		//Old方式
		//SomeBean2 bean2 = SomeBean2Factory.getSomeBean2();
		
		//Ioc方式
		SomeBean2 bean = ctx.getBean("Somebean2", SomeBean2.class);
		System.out.println(bean);
	}*/
	
	
	//③.实例工厂方法实例化：解决系统遗留问题
/*	@Test
	public void test3(){
		//Old方式
//		SomeBean3Factory f = new SomeBean3Factory();
//		SomeBean3 bean3 = f.getSomeBean3();
		
		//Ioc方式
		SomeBean3 bean = ctx.getBean("Somebean3", SomeBean3.class);
		System.out.println(bean);
	}
	*/
	
	//④.实现FactoryBean接口实例化
	@Test
	public void test4(){
		
		//Ioc方式
		SomeBean4 bean = ctx.getBean("Somebean4", SomeBean4.class);
		System.out.println(bean);
		SomeBean4 bean1 = ctx.getBean("Somebean4", SomeBean4.class);
		System.out.println(bean1);
	}
	
	

}
