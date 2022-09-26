/* Program to show how to instantiate and use a simple class with overloaded constructors
Author : Team - J
Version : 1.0*/
class usesimpleclass3{ //declaration of a class simpleclass 

	public static void  main ( String args[]){
		simpleclass3 varsimpleclass31=new simpleclass3();//use no argument constructor

		varsimpleclass31.simplemethod();
		
		simpleclass3 varsimpleclass32=new simpleclass3(32);//use one argument(int) 
								//constructor

		varsimpleclass32.simplemethod();

		simpleclass3 varsimpleclass33=new simpleclass3((float)33.33 );//use one 								//argument(float)  constructor
		varsimpleclass33.simplemethod();

		simpleclass3 varsimpleclass34=new simpleclass3(34,(float)34.34 );//use two 								//argument(int,float)  constructor
		
		varsimpleclass34.simplemethod();

		simpleclass3 varsimpleclass35=new simpleclass3(35,(float)35.35 );//use two 								//argument(float,int)  constructor
		
		varsimpleclass35.simplemethod();
				
		}
	
}
