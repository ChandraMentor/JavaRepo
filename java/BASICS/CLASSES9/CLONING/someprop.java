/* This class is used as a property in some other method for demonstarting why cloning is
required.
Author : Team - J 
Version: 1.0*/

class someprop implements Cloneable{ 
	int a = 10;
	int b = 20;
	public someprop(int i,int j){
		a = i;
		b = j;	
	}
	public void showstate(){
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
	}
	// state manuplated
	public void manuplateprop(){
		a =33;
		b =44;
	}
	// provide clone method so that we can create an exact copy of this object
	public Object clone() throws CloneNotSupportedException{
		return ( super.clone());
	}
}
 