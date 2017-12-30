package com.etcxm._03_jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.ectxm.common.TransactionManager;

import lombok.Setter;

public class TranscationManagerHandler implements InvocationHandler{

	//真实对象
	@Setter
	private Object  target;
	
	@Setter
	private TransactionManager manager;
	
   //代理对象  创建并返回一个代理对象
	public Object getProxyObject(){
		
		return Proxy.newProxyInstance(this.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				this);
	}
	
	
	
	//真正的被代理的方法  增强功能(开启事务,提交事务,回滚事务)
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
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
