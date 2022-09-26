/* Program to show how to write a java class and explain what a 
constructor is*/

class simpleclass2{ //declaration of a class simpleclass 
	//declaration of instance variables
	int instvar1;
	float instvar2; //a class can have any instance variables of either primitive
			// data type or of any class type
	// constructor which takes no parameters
	simpleclass2(){
		instvar1=10;
		instvar2=(float)10.10;
	}

	//this is a simple method which displays the values of instance variables
	void simplemethod(){
		System.out.println(instvar1);
		System.out.println(instvar2);
	}

	// this method sets the values of instance variables of the class
	
	void setvalues(int i, float f){
		instvar1=i;
		instvar2=f;
	}
}
