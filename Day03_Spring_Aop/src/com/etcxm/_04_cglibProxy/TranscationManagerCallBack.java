package com.etcxm._04_cglibProxy;

import java.lang.reflect.Method;

import lombok.Setter;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import com.ectxm.common.TransactionManager;

public class TranscationManagerCallBack implements InvocationHandler {

//	真实对象
	@Setter
	private Object target;
	
	
	@Setter
	private TransactionManager manager;
	
//	代理对象 创建并返回一个代理对象
	public Object getProxyObject(){
		//创建一个增强对象
		Enhancer enhancer = new Enhancer();//子类
		enhancer.setSuperclass(target.getClass());//设置对哪个父类增强
		enhancer.setCallback(this);//设置做什么增强
		
		return enhancer.create();//创建代理对象
		
	}
	
	
	@Override
	public Object invoke(Object object, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		manager.begin();
		Object ret = null;
		try {
			ret = method.invoke(target, args); //真实具体的业务方法(save update)
			manager.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			manager.rollback();
		}
		return ret;
	}

}
