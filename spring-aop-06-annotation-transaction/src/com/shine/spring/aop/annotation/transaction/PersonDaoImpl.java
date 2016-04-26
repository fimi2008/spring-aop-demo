package com.shine.spring.aop.annotation.transaction;

import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao{

	@Override
	public void savePerson() {
		System.out.println("save Person");
	}

}
