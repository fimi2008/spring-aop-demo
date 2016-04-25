package com.shine.spring.aop.xml.annotation;

import java.lang.reflect.Method;

/**
 * 注解解析器
 * @author 王翔
 *
 */
public class AnnotationParse {
	public String parse(Class targetClass, String methodName) throws NoSuchMethodException, SecurityException{
		Method method = targetClass.getMethod(methodName);
		if (null != method){
			// 判断目标方法上面是否存在@PrivilegeInfo注解（@Privilege（name=“savePerson”））
			if (method.isAnnotationPresent(PrivilegeInfo.class)){
				PrivilegeInfo annotation = method.getAnnotation(PrivilegeInfo.class);
				return annotation.name();// 方法的权限的名称
			}
		}
		return "";
	}
}
