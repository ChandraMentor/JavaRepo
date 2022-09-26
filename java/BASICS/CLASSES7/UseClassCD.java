/* This  class is used to test the properties of interfaces

Author : Team - J 
Version: 1.0*/

class UseClassCD  { 
	public static void main(String args[]){
		ClassCD cd = new ClassCD();
		cd.donothing();
		System.out.println(" cd.CONST  = " + cd.CONST);
		InterfaceA a = (InterfaceA)cd;
		InterfaceB b = (InterfaceB)cd;
		ClassC c = (ClassC)cd;
		System.out.println(" a.CONST  = " + a.CONST);
		System.out.println(" b.CONST  = " + b.CONST);
		System.out.println(" b.CONST  = " + b.CONST);
		System.out.println(" InterfaceA.CONST  = " + InterfaceA.CONST);
		System.out.println(" InterfaceB.CONST  = " + InterfaceB.CONST);
		System.out.println(" ClassC.CONST  = " + ClassC.CONST);
		a.donothing();
		b.donothing();
		c.donothing();
		cd.donothing();
		// is there any confusion here on which class variable is accessed
	}
}
 