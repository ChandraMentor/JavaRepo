/* This program demonstrates to import and use a class from a package
Author : Team - J 
Version: 1.0*/
// use import package statement to import package. This class is not
// a part of com.inetsolv.utilpack package
//package com.inetsolv.utilpack;
import com.inetsolv.utilpack.package2;
	

class usepackage2 { 
	// four variable with different access specifiers
	public int IAmPublicVar;	
	private int IAmPrivateVar;
	protected int IAmProtectedVar;
	int DefaultAccVar;
	public static void main(String args[]){
		package2 p1 = new package2();
		System.out.println ( "p1.IAmPublicVar"  +  p1.IAmPublicVar);
		//System.out.println ( "p1.IAmPrivateVar"  +  p1.IAmPrivateVar);
		//System.out.println ( "p1.IAmProtectedVar"  +  p1.IAmProtectedVar);
		//System.out.println ( "p1.DefaultAccVar"  + p1.DefaultAccVar);
		//p1.IAmPublicMethod();
		//p1.IAmPrivateMethod();  
		//p1.IAmProtectedMethod();
		//p1.DefaultAccMethod();
	}	
}
 