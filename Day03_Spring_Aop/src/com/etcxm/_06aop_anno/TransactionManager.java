package com.etcxm._06aop_anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//事务管理
//<!-- 配置事务 -->
//<bean id="tranManager" class="com.ectxm.common.TransactionManager"></bean>
@Component

@Aspect  //what
public class TransactionManager {
	
	//where
	  //<aop:pointcut expression="execution(* com.ectxm.common.service.*Service.* (..))" 
             // id="txpointcut"/>
	@Pointcut("execution(* com.etcxm._06aop_anno.service.*Service.* (..))")
	public void txPointCut(){
	}
	
	//when

	//@Before("txPointCut()")
	public void begin(){
		System.out.println("开启事务");
	}
	
	//@AfterReturning("txPointCut()")
	public void commit(){
		System.out.println("提交事务");
	}
	
	/*public void rollback(Throwable ex){
		System.out.println("回滚事务"+ex.getMessage());
	}
	*/
	//@AfterThrowing(value="txPointCut()",throwing="ex")
	public void rollback(Throwable ex){
		System.out.println("回滚事务"+ex.getMessage());
	}
	public void close(){
		System.out.println("释放资源");
	}
	
	@Around("txPointCut()")
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
