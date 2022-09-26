/* This class shows how cloning can be forbidden by a class
Author : Team - J 
Version: 1.0*/
/* we are not implementing Cloneable interface in this class*/
class CloneNA1 { 
	int a = 10;
	int b = 20;
	public CloneNA1(int i,int j){
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
 