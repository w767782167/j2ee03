package com.etcxm._05test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//告诉JVM Spring容器直接放在JVM上
@RunWith(SpringJUnit4ClassRunner.class)

//加载配置文件
//@ContextConfiguration("classpath:applicationContext.xml")
//@ContextConfiguration("classpath:com/etcxm/_05test/hellotest.xml")
@ContextConfiguration
public class HelloTest {

	//自动注入
	@Autowired
	private BeanFactory factory;
	
    @Test
	public void test(){
		HelloWorld world = factory.getBean("HelloWorld", HelloWorld.class);
		world.sayHello();
	}
}
