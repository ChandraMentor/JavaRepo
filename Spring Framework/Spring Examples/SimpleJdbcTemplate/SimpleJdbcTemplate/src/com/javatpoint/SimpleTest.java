package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SimpleTest {
public static void main(String[] args) {
	
	Resource r=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(r);
	
	EmpDao dao=(EmpDao)factory.getBean("edao");
	int status=dao.update(new Emp(23,"Tarun",35000));
	System.out.println(status);
}
}
