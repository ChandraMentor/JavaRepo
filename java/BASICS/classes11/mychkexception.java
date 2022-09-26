/*This program show how we can create our own exceptions
Author : Team - J 
Version: 1.0*/
// we can derive the class from any of the sub classes
//of throwable class
class mychkexception extends Throwable { 
	mychkexception(){
		super();
	}
	mychkexception(String s){
		super(s);
	}
}
 