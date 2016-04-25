package com.shine.spring.aop.xml.action;

import com.shine.spring.aop.xml.servcie.PersonService;

public class PersonAction {

	private PersonService personService;
	
	public void savePerson(){
		System.out.println(personService.savePerson());
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
}
