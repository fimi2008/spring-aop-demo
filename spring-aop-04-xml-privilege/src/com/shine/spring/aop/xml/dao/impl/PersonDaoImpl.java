package com.shine.spring.aop.xml.dao.impl;

import com.shine.spring.aop.xml.dao.PersonDao;

public class PersonDaoImpl implements PersonDao{

	@Override
	public Object savePerson() {
		System.out.println("save Person");
		return "new Person";
	}

}
