/* Program to show how to write a java class and explain about
finalization*/

class simpleclass4{ //declaration of a class simpleclass 
	//declaration of instance variables
	int instvar1;
	float instvar2; //a class can have any instance variables of either primitive
			// data type or of any class type
	// constructor which takes no parameters
	simpleclass4(){
		instvar1=10;
		instvar2=(float)10.10;
	}
	
	// overloaded constructor that takes one argument
	simpleclass4(int i){
		instvar1=i;
		instvar2=(float)10.10; //try commenting this line and see what happens
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

	// finalize method -- called when garbage collected
	protected void finalize(){
		System.out.println("Object of type simpleclass4 about to be garbage collected");
	}
}
