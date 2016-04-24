package com.shine.spring.aop.xml.dao.impl;

import com.shine.spring.aop.xml.dao.StudentDao;


public class StudentDaoImpl implements StudentDao {
	public String saveStudent() throws Exception{
		/*boolean flag = false;
		if (!flag){
			throw new RuntimeException("对不起.Student保存报错出现异常!");
		}*/
		System.out.println("save student");
		return "保存成功";
	}

	@Override
	public void queryStudent() throws Exception {
		System.out.println("query student");
	}

	@Override
	public void delStudent() throws Exception {
		System.out.println("del student");
	}

	@Override
	public void updateStudent() throws Exception {
		System.out.println("update student");
	}
}
