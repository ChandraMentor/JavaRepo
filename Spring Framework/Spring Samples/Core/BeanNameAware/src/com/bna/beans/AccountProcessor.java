package com.bna.beans;

import org.springframework.beans.factory.BeanNameAware;

public class AccountProcessor implements BeanNameAware {
	private String beanName;
	private String key;	

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		System.out.println("Injecting Key using Setter injection");
		this.key = key;
	}

	public void setBeanName(String beanName) {
		System.out.println("Aware Injection");
		this.beanName = beanName;
	}

	public void computeLedgerBalance() {
		System.out.println("entered computeLedgerBalance() - using bean : "
				+ beanName);
		// business logic
		System.out.println("exiting computeLedgerBalance() - using bean : "
				+ beanName);
	}

}
