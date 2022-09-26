/* This class shows how to use cloning method
Author : Team - J 
Version: 1.0*/

class UseCloneA1  { 
	public static void main( String args[]) throws Exception{
		CloneA1 c1,c2,c3;
		c1 = new CloneA1(10,20);
		c2 = c1;
		System.out.println("......c1 state........");
		c1.showstate();
		System.out.println("......c2 state........");
		c2.showstate();
		// let us try to create a clone of c1 
		c3 = (CloneA1) c1.clone();
		System.out.println("......c3 state........");
		c3.showstate();
	}
}
 