package com.shine.spring.aop.xml.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.spring.aop.xml.service.PersonService;
import com.shine.spring.aop.xml.service.StudentService;

/**
 * 将异常的处理和servcie层,dao层彻底松耦合
 */
public class ExceptionTest {
	
	@Test
	public void testException() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService personService = (PersonService)context.getBean("personService");
		StudentService studentService = (StudentService)context.getBean("studentService");
		studentService.saveStudent();
		personService.savePerson();
	}
}
