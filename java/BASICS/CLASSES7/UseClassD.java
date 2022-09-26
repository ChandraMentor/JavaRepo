/* This  class implements two interfaces , used to demonstrate multiple inheritance

Author : Team - J 
Version: 1.0*/

class UseClassD  { 
	public static void main(String args[]){
		ClassD cd = new ClassD();
		cd.donothing();
		System.out.println(" cd.CONST  = " + cd.CONST);
		InterfaceA a = (InterfaceA)cd;
		InterfaceB b = (InterfaceB)cd;
		InterfaceC c = (InterfaceC)cd;
		System.out.println(" a.CONST  = " + a.CONST);
		System.out.println(" b.CONST  = " + b.CONST);
		System.out.println(" b.CONST  = " + b.CONST);
		System.out.println(" InterfaceA.CONST  = " + InterfaceA.CONST);
		System.out.println(" InterfaceB.CONST  = " + InterfaceB.CONST);
		System.out.println(" InterfaceC.CONST  = " + InterfaceC.CONST);
		// is there any confusion here on which class variable is accessed
		a.donothing();
		b.donothing();
		c.donothing();
	}
}
 