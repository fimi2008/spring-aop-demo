
package com.shine.spring.aop.xml.action;

import com.shine.spring.aop.xml.service.StudentService;

public class StudentAction {
	private StudentService studentService;
	
	public void saveStudent() throws Exception{
		studentService.saveStudent();
	}

	public void queryStudent() throws Exception{
		studentService.updateStudent();
	}

	public void delStudent() throws Exception{
		studentService.updateStudent();
	}

	public void updateStudent() throws Exception{
		studentService.updateStudent();
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}