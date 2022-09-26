package com.ba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ba.beans.BankTransact;

public class BeforeAdviceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ba/common/aop-beans.xml");
		
		BankTransact bt = context.getBean("bankTransact", BankTransact.class);
		System.out.println("Balance : " + bt.withdraw("35", 343.3f));
	}
}