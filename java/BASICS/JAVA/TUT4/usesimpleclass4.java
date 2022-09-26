/* Program to show how to instantiate and use a simple class with overloaded constructors
Author : Team - J
Version : 1.0*/
class usesimpleclass4{ //declaration of a class simpleclass 

	public static void  main ( String args[]){
		Thread t;
		usesimpleclass4 varusesimpleclass4=new usesimpleclass4();
		varusesimpleclass4.testgc();
		System.runFinalization(); // run garbage collector 
		t= Thread.currentThread();
		Thread.yield();
		Runtime.getRuntime().runFinalization();//same as calling System.runFinalization()
		
		for(int i= 1; i<2147483600;i++);
		}
	// this method just creates an object and calls a method on it
	void testgc(){
		simpleclass4 varsimpleclass4=new simpleclass4();//use no argument constructor
		simpleclass4 varsimpleclass41=new simpleclass4();//use no argument constructor
		System.out.println("In testgc method");
		varsimpleclass4.simplemethod();
	}
	
}
