/* Program to show how to instantiate and use a simple class*/

class usesimpleclass1{ //declaration of a class simpleclass 

	public static void  main ( String args[]){
		simpleclass1 varsimpleclass1;// declare a variable of type simpleclasss1
		
		varsimpleclass1 = new simpleclass1(); // crate an object of type simpleclass1
		//call the method simplemethod
		varsimpleclass1.simplemethod();
		varsimpleclass1.setvalues(10,(float)19.99);
		//call the method simplemethod once again
		varsimpleclass1.simplemethod();

		}
	
}
