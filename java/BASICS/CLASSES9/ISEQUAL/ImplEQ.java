/* This class implements isequal method
Author : Team - J 
Version: 1.0*/
class ImplEQ implements Cloneable { 
	int a = 10;
	int b = 20;
	public ImplEQ(int i,int j){
		a = i;
		b = j;	
	}
	/* we are not allowing to clone the object by always raising the exception
	   clone not supported exception*/
	public Object clone() throws CloneNotSupportedException{
		//call super class clone method
		return ( super.clone());
	}
	public void showstate(){
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
	}
	//implementation of equals function to perform value equivalance
	// in Object class the same method tests for reference equivalance
	public boolean equals(Object o){
		ImplEQ o1 = (ImplEQ) o;
		// if object the objects has the same state then return true
		if (this.a == o1.a && this.b == o1.b)
			return true;
		else
			return false;
	}
	// When ever you override equals method you have to override hashcode
	// method. hash code function should return a value which should be
	// unique for every object. Here since we have two properties we can
	// add them to get a hash code so that it returns same hashcode for
	// objects that have same internal state. String class uses 
	// s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1] formula to compute
	// hash code and the Object's class default implementation uses the internal
	// addresses of objects to return hashcode.

	public int hashCode() {
		return this.a + this.b;
  	}
}
 