package com.shine.spring.aop.xml.service.impl;

import com.shine.spring.aop.xml.dao.StudentDao;
import com.shine.spring.aop.xml.service.StudentService;


public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;
	
	public String saveStudent() throws Exception{
		return studentDao.saveStudent();
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
}
