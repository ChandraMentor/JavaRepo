/* Program to show how to write a java class and explain about
constructor overloading*/

class simpleclass3{ //declaration of a class simpleclass 
	//declaration of instance variables
	int instvar1;
	float instvar2; //a class can have any instance variables of either primitive
			// data type or of any class type
	// constructor which takes no parameters
	simpleclass3(){
		instvar1=10;
		instvar2=(float)10.10;
	}
	
	// overloaded constructor that takes one argument
	simpleclass3(int i){
		instvar1=i;
		instvar2=(float)10.10; //try commenting this line and see what happens
	}
	
	// overloaded constructor that takes one argument
	simpleclass3(float f){
		instvar1=22;
		instvar2=f;
	}
	// overloaded constructor that takes two argument
	simpleclass3(int i, float f){
		instvar1=i;
		instvar2=f; 
	}

	// overloaded constructor that takes two argument same as above but there is difference
	// in the order of passing parameters
	simpleclass3(float f, int i ){
		instvar1=i;
		instvar2=f; 
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
