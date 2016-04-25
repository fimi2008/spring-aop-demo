package com.shine.spring.aop.xml.servcie.impl;

import com.shine.spring.aop.xml.annotation.PrivilegeInfo;
import com.shine.spring.aop.xml.dao.PersonDao;
import com.shine.spring.aop.xml.servcie.PersonService;

public class PersonServiceImpl implements PersonService{
	
	private PersonDao personDao;

	@Override
	@PrivilegeInfo(name="savePerson")
	public Object savePerson() {
		return personDao.savePerson();
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
}
