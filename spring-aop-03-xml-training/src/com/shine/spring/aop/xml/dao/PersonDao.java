package com.shine.spring.aop.xml.dao;

public interface PersonDao {
	public String savePerson() throws Exception;
	
	public void queryPerson() throws Exception;
	
	public void delPerson() throws Exception;
	
	public void updatePerson() throws Exception;
}
