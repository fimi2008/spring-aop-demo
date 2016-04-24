package com.shine.spring.aop.xml.aspect;

import org.aspectj.lang.JoinPoint;

public class ExceptionAspect {

	public void exceptionAdvice(JoinPoint joinPoint, Throwable ex){
		System.out.println(ex.getMessage());
	}
}
