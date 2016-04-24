package com.shine.spring.aop.xml.dao;

public interface StudentDao {
	public String saveStudent() throws Exception;
	
	public void queryStudent() throws Exception;
	
	public void delStudent() throws Exception;
	
	public void updateStudent() throws Exception;
}
