/*This program show how we can create our own exceptions
Author : Team - J 
Version: 1.0*/
// we can derive the class from any of the sub classes
//of error or runtimeexception .Even though it is not good to create
// unchecked exceptions we are creating this for demonstrating how we can
// create one such exception
class myunchkexception extends RuntimeException{ 
	myunchkexception(){
		super();
	}
	myunchkexception(String s){
		super(s);
	}
}
 