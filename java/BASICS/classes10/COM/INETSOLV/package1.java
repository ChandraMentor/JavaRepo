/* This program demonstrates a way to access two different classes with
same name in different packages
Author : Team - J 
Version: 1.0*/
// use package statement to create package.

package com.inetsolv;

public class package1 { 
	// four variable with different access specifiers
	public int IAmPublicVar;	
	private int IAmPrivateVar;
	protected int IAmProtectedVar;
	int DefaultAccVar;
	public void IAmPublicMethod(){
		System.out.println ( "com.inetsolv: In IAmPublicMethod() method");
	}	
	private void IAmPrivateMethod(){
		System.out.println ( "com.inetsolv: In IAmPrivateMethod() method");
	}	
	protected void IAmProtectedMethod(){
		System.out.println ( "com.inetsolv: In IAmProtectedMethod() method");
	}	
	void DefaultAccMethod(){
		System.out.println ( "com.inetsolv: In DefaultAccMethod() method");
	}	
}
 
 