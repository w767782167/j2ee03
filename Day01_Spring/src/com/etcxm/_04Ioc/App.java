package com.etcxm._04Ioc;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Iterator;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import sun.awt.geom.AreaOp.IntOp;

public class App {
	
	/*@Test
	public void testOld(){
		//使用new 创建对象
		HelloWorld world = new HelloWorld();
		world.setUsername("张芳芳");
		world.sayHello();
	}*/
	
	
	/*@Test
	public void testIoc(){
		//ioc将创建对象的控制权交给Spring容器
		
		//1.从classpath根路径获取和加载资源文件
		Resource resource = new ClassPathResource("applicationContext.xml");
		//2.创建Spring 容器对象
		BeanFactory factory = new XmlBeanFactory(resource) ;
		//3.从容器对象中根据指定id获取对象
		HelloWorld world = (HelloWorld)factory.getBean("HelloWorld");
		//4.自己操作
		world.sayHello();
	}*/
	
	
	//getBean方法的三种签名
	@Test
	public void testIoc(){
		//ioc将创建对象的控制权交给Spring容器
		
		//1.从classpath根路径获取和加载资源文件
		Resource resource = new ClassPathResource("applicationContext.xml");
		//2.创建Spring 容器对象
		BeanFactory factory = new XmlBeanFactory(resource) ;
		//3.从容器对象中根据指定id获取对象
		HelloWorld world = null;
	    
		//-----1,按照类型拿bean
		//world = factory.getBean(HelloWorld.class);
		
		
		//------2,按照bean的名字拿bean
		//int age = (Integer)factory.getBean("HelloWorld1");
		
		//-----3,按照名字和类型:(推荐)
		world = factory.getBean("hi", HelloWorld.class);
		
		world.sayHello();
	}
	
	//Spring 管理Bean的原理
	/*@Test
	public void testHow() throws Exception{
		Class czz = Class.forName("com.etcxm._04Ioc.HelloWorld");
		//使用反射创建管理类的对象
		Object obj =  czz.getDeclaredConstructor().newInstance();
		
		//给对象username设置属性值为jack
		BeanInfo info = Introspector.getBeanInfo(czz, Object.class);
		PropertyDescriptor[] ps = info.getPropertyDescriptors();
		for (PropertyDescriptor p : ps) {
			
			if("username".equals(p.getName())){
				p.getWriteMethod().invoke(obj, "jack");
			}
			System.out.println(p.getName());
			
			System.out.println(p.getValue(p.getName()));
		}
		
		HelloWorld world =  (HelloWorld)obj;
		world.sayHello();
		
		
		
	}*/

}
