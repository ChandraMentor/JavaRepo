package org.hello;

public class HelloImpl implements Hello {
	private String greeting;

  //default constructor
	public HelloImpl(){
	}
	//parameterized constructor
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