package com.shine.spring.aop.xml.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import com.shine.spring.aop.xml.utils.JdbcUtils;

public class RunningTimeAspect {
	
	public Object runningAdrvice(ProceedingJoinPoint joinPoint) throws Throwable{
		String className = joinPoint.getTarget().getClass().getSimpleName();
		String methodName = joinPoint.getSignature().getName();
		Long startTime = System.currentTimeMillis();
		Object target = joinPoint.proceed();
		Long endTime = System.currentTimeMillis();
		Long rt = endTime - startTime;
		JdbcUtils.insertActionMethodTime(className, methodName, rt);
		return target;
	}
}
