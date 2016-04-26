package com.shine.spring.aop.xml.salary;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 查询薪水练习
 * 		一个切入点可以被多个切面引用
 * @author 王翔
 *
 */
public class SalaryTest {
	
	@Test
	public void testSalary(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Privilege privilege =  (Privilege)context.getBean("privilege");
		privilege.setName("admin");
		SalaryManager salaryManager = (SalaryManager)context.getBean("salaryManager");
		salaryManager.searchSalary();
	}
}
