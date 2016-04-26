package com.shine.spring.aop.annotation.transaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用AspectJ注解开发AOP应用时，会遇到以下问题： ::0 can't find referenced pointcut 这个问题，实际是与你所在的开发环境有关，如下
 *
 *	jdk version	spring version	aspectjrt version and aspectjweaver version
 *	1.6	3.0 +	aspectjrt-1.6.2  and aspectjweaver-1.6.2
 *	1.7	3.0 +	aspectjrt-1.7.3 and aspectjweaver-1.7.3
 *
 *
 * 科普下：
 * 	jdkproxy：目标类和代理类实现了共同的接口。
 * 	cglib： 目标类是代理类的父类。
 * 	CGLIB（CODE GENERLIZE LIBRARY）代理是针对类实现代理，主要是对指定的类生成一个子类，覆盖其中的所有方法，所以该类或方法不能声明称final的。
 * @author 王翔
 *
 */
public class AnnotationTest {
	@Test
	public void testAnnotation(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		/**
		 * <aop:aspectj-autoproxy proxy-target-class="true"></aop:aspectj-autoproxy>
		 * 如果不使用接口，则需使用上方的配置，使用cglib生成代理
		 * 如果目标对象没有实现接口，则默认会采用CGLIB代理；
		 */
//		PersonDaoImpl personDao = (PersonDaoImpl)context.getBean("personDao"); 
		personDao.savePerson();
	}
}
