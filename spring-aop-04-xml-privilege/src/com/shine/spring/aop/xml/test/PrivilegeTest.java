package com.shine.spring.aop.xml.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.spring.aop.xml.action.PersonAction;
import com.shine.spring.aop.xml.aspect.AccessTargetMethod;
import com.shine.spring.aop.xml.bean.Privilege;

public class PrivilegeTest {
	
	@Test
	public void testPrivilege(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccessTargetMethod accessMethod = (AccessTargetMethod)context.getBean("accessMethod");
		// 初始化用户权限
		List<Privilege> userP = accessMethod.getUserP();
		Privilege p = new Privilege();
		p.setName("savePerson");
		userP.add(p);
		
		// 开始调用方法
		PersonAction personAction= (PersonAction)context.getBean("personAction");
		personAction.savePerson();
	}
}
