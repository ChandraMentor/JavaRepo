/* This program demonstrates to create a package and 
use different vars/methods
Author : Team - J 
Version: 1.0*/
// use package statement to create package.


import com.inetsolv.utilpack.package1;

//import com.inetsolv.package1;
class package5 { 
	public void somemethod(){
		//package1 p1 = new package1();
		com.inetsolv.package1 p1 = new com.inetsolv.package1();
		package1 p2 = new package1();
		
		//IAmPrivateMethod();
		//IAmProtectedMethod();
		//DefaultAccMethod();
	}	
}
 