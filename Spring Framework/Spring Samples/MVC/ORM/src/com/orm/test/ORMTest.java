package com.orm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.beans.StudentInfo;
import com.orm.service.StudentService;

public class ORMTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/orm/common/application-context.xml");
		StudentService ss = context.getBean("studentService",
				StudentService.class);
		StudentInfo student = new StudentInfo();
		student.setId(2);
		student.setName("Rama");
		ss.insert(student);

		StudentInfo s = ss.findStudent(2);
		System.out.println(s);
	}

}
