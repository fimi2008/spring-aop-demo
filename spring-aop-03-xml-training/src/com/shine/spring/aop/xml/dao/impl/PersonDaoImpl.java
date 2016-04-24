package com.shine.spring.aop.xml.dao.impl;

import com.shine.spring.aop.xml.dao.PersonDao;


public class PersonDaoImpl implements PersonDao {
	public String savePerson() throws Exception{
/*		boolean flag = false;
		if (!flag){
			throw new RuntimeException("对不起.Person保存报错出现异常!");
		}
*/		System.out.println("save person");
		return "保存成功";
	}

	@Override
	public void queryPerson() throws Exception {
		System.out.println("query person");
	}

	@Override
	public void delPerson() throws Exception {
		System.out.println("del person");
	}

	@Override
	public void updatePerson() throws Exception {
		System.out.println("update person");
	}
}
