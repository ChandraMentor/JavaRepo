/* This  Program is a simple java Application which
shows how to use literals in java (integer)
Author : Team - J 
Version: 1.0*/

class intlit { 
	public static void main(String args[]){
		int i=222222; //decimal notation
		i=0xfff; //hexadecimal notation
		System.out.println("integer i = " + i);
		i=0xffe; //hexadecimal notation
		System.out.println("integer i = " + i);
		i=0777; //octal notation
		System.out.println("integer i = " + i);
		i=00; // is this octal or decimal ?
		System.out.println("integer i = " + i);
		//i=0xadm; not valid
		//i=8a99; not valid
		//i=0999; not valid
		//i=008979; not valid 
		//let us experiment with byte type
		byte b=34; //valid
		//b=2222; // why this is not valid?
		b=(byte)2224; 
		System.out.println("byte b = " + b);
		b= 127; // try b = 128
		System.out.println("byte b = " + b);
		//b = 127 + 22;  why this is not valid ?
		System.out.println("byte b = " + b);
		b=-0x0f;
		System.out.println("byte b = " + b);
		b=-0077;
		System.out.println("byte b = " + b);
		
	}	
}