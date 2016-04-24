package com.shine.spring.aop.xml.dao.impl;

import com.shine.spring.aop.xml.dao.PersonDao;


public class PersonDaoImpl implements PersonDao {
	public String savePerson() throws Exception{
		boolean flag = false;
		if (!flag){
			throw new RuntimeException("对不起.Person保存报错出现异常!");
		}
		System.out.println("save person");
		return "保存成功";
	}
}
