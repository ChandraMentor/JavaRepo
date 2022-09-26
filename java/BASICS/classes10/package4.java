/* This program demonstrates to create a package and use different vars/methods
Author : Team - J 
Version: 1.0*/
// use package statement to create package.


import 	com.inetsolv.utilpack.package2;
class package4 extends package2 { 
	public void somemethod(){
		super.IAmPublicMethod();
		//IAmPrivateMethod();
		IAmProtectedMethod();
		//DefaultAccMethod();
	}	
}
 