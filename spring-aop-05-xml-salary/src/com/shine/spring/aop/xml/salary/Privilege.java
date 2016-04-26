package com.shine.spring.aop.xml.salary;

import org.aspectj.lang.ProceedingJoinPoint;

public class Privilege {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 环绕通知
	 * @param joinPoint
	 * @throws Throwable 
	 */
	public Object access(ProceedingJoinPoint joinPoint) throws Throwable{
		if (this.name.equals("admin")){
			return joinPoint.proceed();
		}else{
			System.out.println("没有权限");
			return "没有权限";
		}
	}
}
