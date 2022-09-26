/* This  Program is a simple java Application which
shows how to add two byte data type variables
Author : Team - J 
Version: 1.0*/

class byteadd { 
	public static void main(String args[]){
		byte i=127,j=22,k;
		k=(byte)(i+j);
		System.out.println(" i + j = " + k);
		k=(byte)(127 + 1);
		System.out.println(" 127 + 1 = " + k);
		k=(byte)(127 + 130);
		System.out.println(" 127 + 130 = " + k);
		j=(byte)(j -22);
	//	k=(byte)(i/j); //divide by zero throws an exception
		// what is an exception ? we will see this later in detail
		//k=(byte)i/0) is compile time error ??
		 i = -1;
	}	
}