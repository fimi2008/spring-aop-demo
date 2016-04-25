package com.shine.spring.aop.xml.aspect;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;

import com.shine.spring.aop.xml.annotation.AnnotationParse;
import com.shine.spring.aop.xml.bean.Privilege;

public class AccessTargetMethod {

	private List<Privilege> userP = new ArrayList<Privilege>();
	
	public Object accessMethod(ProceedingJoinPoint joinPoint) throws Throwable{
		/**
		 * 得到目标类的class形式
		 * 得到目标方法
		 */
		Class targetClass = joinPoint.getTarget().getClass();
		String methodName = joinPoint.getSignature().getName();
		AnnotationParse ap = new AnnotationParse();
		String access = ap.parse(targetClass, methodName);
		for (Privilege p : userP){
			// 判断用户是否具有权限
			if (p.getName().equals(access)){
				return joinPoint.proceed();
			}
		}
		
		return "对不起。你暂无权限";
	}

	// 用于初始化用户权限
	public List<Privilege> getUserP() {
		return userP;
	}
}
