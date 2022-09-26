package com.gui;

public class HelloImpl implements Hello {
	private String greeting;

	public HelloImpl(){
	}
	public HelloImpl(String a) {
	greeting=a;
	}
	public String sayhello(String s){
	return greeting+s;
	}
	public void setgreeting(String a){
	greeting=a;
	}
}