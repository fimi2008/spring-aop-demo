
package com.shine.spring.aop.xml.action;

import com.shine.spring.aop.xml.service.PersonService;

public class PersonAction {
	private PersonService personService;
	
	public void savePersion() throws Exception{
		personService.savePerson();
	}
	
	public void queryPerson() throws Exception{
		Thread.sleep(1000);
		personService.queryPerson();
	}
	
	public void delPerson() throws Exception{
		personService.delPerson();
	}
	
	public void updatePerson() throws Exception{
		personService.updatePerson();
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
}