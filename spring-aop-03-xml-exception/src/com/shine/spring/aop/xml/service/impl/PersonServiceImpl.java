package com.shine.spring.aop.xml.service.impl;

import com.shine.spring.aop.xml.dao.PersonDao;
import com.shine.spring.aop.xml.service.PersonService;


public class PersonServiceImpl implements PersonService {
	
	private PersonDao personDao;
	
	public String savePerson() throws Exception{
		return personDao.savePerson();
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
}
