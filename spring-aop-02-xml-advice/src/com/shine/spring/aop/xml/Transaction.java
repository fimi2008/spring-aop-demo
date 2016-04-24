package com.shine.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Transaction {
	/**
	 * 前置通知
	 * 参数:1.JoinPoint 连接点:客户端调用哪个方法,这个方法就是连接点
	 */
	public void beginTransaction(JoinPoint joinPoint){
		System.out.println("目标类:"+joinPoint.getTarget().getClass());
		System.out.println("目标方法名:"+joinPoint.getSignature().getName());
		System.out.println("目标参数:"+joinPoint.getArgs().length);
		
		System.out.println("begin transaction");
	}
	
	/**
	 * 后置通知
	 */
	public void commit(JoinPoint joinPoint, Object val){
		System.out.println("目标方法返回值:"+val);
		System.out.println("commit");
	}
	
	/**
	 * 异常通知
	 */
	public void rollback(JoinPoint joinPoint, Throwable ex){
		System.out.println("目标方法抛出异常:"+ex.getMessage());
		System.out.println("rollback");
	}
	
	/**
	 * 最终通知
	 */
	public void finallyAdrive(){
		System.out.println("最终通知");
	}

	/**
	 * 环绕通知
	 * @param joinPoint
	 * @return
	 * @throws Throwable 
	 */
	public Object aroundAdrive(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("环绕通知");
		return joinPoint.proceed(); // 执行目标方法
	}
}
