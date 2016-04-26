package com.shine.spring.aop.annotation.transaction;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Aspect
 * @Pointcut("execution(* com.shine.spring.aop.annotation.transaction.PersonDaoImpl.*(..))")
 *	private void aa(){} 
 *	== 
 *	<aop:config>
 *		<aop:pointcut expression="execution(* com.shine.spring.aop.annotation.transaction.PersonDaoImpl.*(..))"
 *		 id="aa()"/>
 *	</aop:config>
 * @author 王翔
 *
 */
@Component("transaction") // 第一步放入spring容器
@Aspect // 说明该类是一个切面
public class Transaction {
	@Pointcut("execution(* com.shine.spring.aop.annotation.transaction.PersonDaoImpl.*(..))")
	private void aa(){}// 方法签名
	
	/**
	 * 前置通知
	 */
	@Before("aa()")
	public void beginTransaction(){
		System.out.println("start transaction");
	}
	
	/**
	 * 后置通知
	 */
	@AfterReturning("aa()")
	public void commit(){
		System.out.println("commit...");
	}
	
	/**
	 * 异常通知
	 */
	@AfterThrowing("aa()")
	public void rollblack(){
		System.out.println("rollblack...");
	}
}
