package com.java.sphib;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {
	public static void main(String[] args) {
		
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		
		EmployeeDao dao=(EmployeeDao)factory.getBean("dao");
		
		Employee e=new Employee();
		e.setId(147);
		e.setName("kumar");
		e.setSalary(70000);
		dao.updateEmployee(e);
	     }
}