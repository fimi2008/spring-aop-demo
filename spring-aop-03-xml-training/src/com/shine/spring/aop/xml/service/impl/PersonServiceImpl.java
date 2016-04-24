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

	@Override
	public void queryPerson() throws Exception {
		personDao.queryPerson();
	}

	@Override
	public void delPerson() throws Exception {
		personDao.delPerson();
	}

	@Override
	public void updatePerson() throws Exception {
		personDao.updatePerson();
	}
}
