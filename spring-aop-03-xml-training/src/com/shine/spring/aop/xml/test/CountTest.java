package com.shine.spring.aop.xml.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.spring.aop.xml.action.PersonAction;
import com.shine.spring.aop.xml.action.StudentAction;
import com.shine.spring.aop.xml.dao.PersonDao;
import com.shine.spring.aop.xml.dao.StudentDao;
import com.shine.spring.aop.xml.service.PersonService;
import com.shine.spring.aop.xml.service.StudentService;

/**
 * 统计action,service,dao层下方面被调用的次数
 */
public class CountTest {
	
	@Test
	public void testCount() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonAction personAction = (PersonAction)context.getBean("personAction");
		StudentAction studentAction = (StudentAction)context.getBean("studentAction");
		PersonService personService = (PersonService)context.getBean("personService");
		StudentService studentService = (StudentService)context.getBean("studentService");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		StudentDao studentDao = (StudentDao)context.getBean("studentDao");
		studentService.saveStudent();
		personService.savePerson();
		personAction.queryPerson();
		personAction.savePersion();
//		studentAction.saveStudent();
//		studentAction.updateStudent();
//		studentAction.delStudent();
//		studentDao.delStudent();
//		personDao.queryPerson();
	}
}
