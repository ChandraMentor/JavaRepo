/* This class shows why cloning is important
Author : Team - J 
Version: 1.0*/

class UseWhyClone { 
	
	public static void main (String args[]) throws Exception{
		WhyClone wc1,wc2;
		someprop ca;
		wc1 = new WhyClone(10,20);
		wc2 = wc1;
		// actually ca is one of the property of WhyClone class
		ca = wc1.getpart();
		wc1.showstate();
		ca.manuplateprop();
		System.out.println(" After manuplating property");
		wc1.showstate();
		// isn't this voilating the OOP Fundamentals  ??

		// how to avoid this now ??
		
		wc2 = new WhyClone(40,40);
		ca = wc2.getpart2();
		wc2.showstate();
		ca.manuplateprop();
		System.out.println(" After manuplating property");
		wc2.showstate();
		// We are now true OOP programmers
	}
}
 