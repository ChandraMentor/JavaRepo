/* This program demonstrates to create a package and use different vars/methods
Author : Team - J 
Version: 1.0*/
// use package statement to create package.

package com.inetsolv.utilpack;
import 	com.inetsolv.utilpack.package1;
class package3 extends package1 { 
	public void somemethod(){
		super.IAmPublicMethod();
		//IAmPrivateMethod();
		IAmProtectedMethod();
		DefaultAccMethod();
	}	
}
 