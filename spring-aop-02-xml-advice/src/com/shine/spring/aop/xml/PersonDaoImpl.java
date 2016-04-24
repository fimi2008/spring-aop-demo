package com.shine.spring.aop.xml;

public class PersonDaoImpl implements PersonDao{
	public String savePerson() {
		/*boolean flag = false;
		if (!flag){
			throw new RuntimeException("对不起.报错出现异常!");
		}*/
		System.out.println("save person");
		return "保存成功";
	}
}
