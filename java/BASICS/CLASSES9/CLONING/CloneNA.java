/* This class shows how cloning can be forbidden by a class
Author : Team - J 
Version: 1.0*/
/* by implementing Cloneable interface we are saying that we allow cloning*/
class CloneNA implements Cloneable { 
	int a = 10;
	int b = 20;
	public CloneNA(int i,int j){
		a = i;
		b = j;	
	}
	/* we are not allowing to clone the object by always raising the exception
	   clone not supported exception*/
	public Object clone() throws CloneNotSupportedException{
		throw  (new CloneNotSupportedException());
	}
	public void showstate(){
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
	}
}
 