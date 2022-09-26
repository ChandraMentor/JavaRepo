package com.after.advice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args){

		 BeanFactory factory = new DefaultListableBeanFactory();
         BeanDefinitionRegistry reg = (BeanDefinitionRegistry) factory;
	      XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(reg);
	      reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
		 Operation e = (Operation) factory.getBean("opBean");
		System.out.println("calling msg...");
		e.msg();
		System.out.println("calling m...");
		e.m();
		System.out.println("calling k...");
		e.k();
	}
}