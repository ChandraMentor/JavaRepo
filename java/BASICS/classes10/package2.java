/* This program demonstrates to create a package
Author : Team - J 
Version: 1.0*/
// use package statement to create package.

package com.inetsolv.utilpack;

// this class is a public class so this can be accessed outside 
// this package also
public class package2 { 
	// four variable with different access specifiers
	public int IAmPublicVar;	
	private int IAmPrivateVar;
	protected int IAmProtectedVar;
	int DefaultAccVar;
	public void IAmPublicMethod(){
		System.out.println ( " In IAmPublicMethod() method");
	}	
	private void IAmPrivateMethod(){
		System.out.println ( " In IAmPrivateMethod() method");
	}	
	protected void IAmProtectedMethod(){
		System.out.println ( " In IAmProtectedMethod() method");
	}	
	void DefaultAccMethod(){
		System.out.println ( " In DefaultAccMethod() method");
	}	
}
 