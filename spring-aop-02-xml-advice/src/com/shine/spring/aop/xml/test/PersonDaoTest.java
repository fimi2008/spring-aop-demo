package com.shine.spring.aop.xml.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shine.spring.aop.xml.PersonDao;

/**
 * aop原理
 * 	1.启动spring容器
 * 	2.spring容器会为personDao和transaction实例化
 * 	3.spring容器解析aop:config的配置
 * 		当spring容器解析到切入点表达式的时候,就会把切入点表达式解析出来,会让切入点表达式的类和spring容器中的类进行匹配,
 * 		如果匹配成功,则会为该对象创建代理对象,代理对象的方法的形成=通知+目标方法
 * 		若果匹配不成功,则会报错
 *  4.在客户端context.getBean时,
 *  	如果当前的对象有代理对象,则返回代理对象
 *  	如果没有代理对象,则返回对象的本身
 *  5.在spring内部会检查目标类有没有实现接口
 *  	如果目标类实现接口,则采用jdkproxy产生代理对象
 *  	如果目标类没有实现接口,则采用cglibproxy产生代理对象
 * @author xiang_wang
 *
 * 2016年4月24日
 */
public class PersonDaoTest {
	
	@Test
	public void testPersonDao(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		personDao.savePerson();
	}
}
