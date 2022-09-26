/* This  Program is a simple java Application which
uses minimum and maximum values for byte data type
Author : Team - J 
Version: 1.0*/

class mmbyte { 
	public static void main(String args[]){
		byte b1 = -128;
		byte b2 = 127;
		System.out.println(" b1 = " + b1);
		System.out.println(" b1 = " + b1);
		b1--;
		b2++;
		System.out.println(" b1 = " + b1);
		System.out.println(" b2 = " + b2);
		/* try to assign -129 to b1 and check what happens 
		when you compile your program*/
		b1=(byte)-130;
		System.out.println(" b1 = " + b1);
	}	
}