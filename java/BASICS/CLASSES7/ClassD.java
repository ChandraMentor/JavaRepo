/* This  class implements two interfaces , used to demonstrate multiple inheritance

Author : Team - J 
Version: 1.0*/

class ClassD implements InterfaceB,InterfaceC  { 
	public static final int CONST =40;
	public int donothing(){
		System.out.println(" Dummy method in ClassD");
		return (100);
	}
}
 