/* Program to show how to instantiate and use a simple class
Author : Team - J
Version : 1.0*/
class usesimpleclass2{ //declaration of a class simpleclass 

	public static void  main ( String args[]){
		simpleclass2 varsimpleclass2=new simpleclass2();//declare a variable of type 						//simpleclasss1 and create an object using new keyword
		//call the method simplemethod
		varsimpleclass2.simplemethod();
		varsimpleclass2.setvalues(10,(float)19.99);
		//call the method simplemethod once again
		varsimpleclass2.simplemethod();

		}
	
}
