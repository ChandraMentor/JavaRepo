/* This class shows how cloning can be allowed by a class
Author : Team - J 
Version: 1.0*/
/* by implementing Cloneable interface we are saying that we allow cloning in this class
we are not implementing the method clone*/
class CloneA1 implements Cloneable { 
	int a = 10;
	int b = 20;
	public CloneA1(int i,int j){
		a = i;
		b = j;	
	}
	public void showstate(){
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
	}
	/* in this clone implements let us use the default clone that is implemented
	   in Object Class*/
	public Object clone() throws CloneNotSupportedException{
		//call super class clone method
		return (super.clone());
	}
}
 