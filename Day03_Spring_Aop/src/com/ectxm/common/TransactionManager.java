package com.ectxm.common;

import org.aspectj.lang.ProceedingJoinPoint;

//事务管理
public class TransactionManager {

	public void begin(){
		System.out.println("开启事务");
	}
	
	public void commit(){
		System.out.println("提交事务");
	}
	
	/*public void rollback(Throwable ex){
		System.out.println("回滚事务"+ex.getMessage());
	}
	*/
	public void rollback(){
		System.out.println("回滚事务");
	}
	public void close(){
		System.out.println("释放资源");
	}
	
	public Object aroundMethod(ProceedingJoinPoint pjp) {
		System.out.println("开启事务");
		Object ret=null;
		try {
			//具体业务方法
			ret=pjp.proceed();
			System.out.println("提交事务");
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println("回滚事务");
		} finally{
			System.out.println("释放资源");
		}
		return ret;
	}
}
