/* This  Program is a simple java Application which
uses minimum and maximum values for int data type
Author : Team - J 
Version: 1.0*/

class mmlong { 
	public static void main(String args[]){
		long l1 = -9223372036854775808L;
		long l2 = 9223372036854775807L; 
		System.out.println(" l1 = " + l1); 
		System.out.println(" l2 = " + l2);
		l1--;
		l2++;
		System.out.println(" l1 = " + l1);
		System.out.println(" l2 = " + l2);
	/* try to assign -9223372036854775809  to l1 and check what happens 
		when you compile your program*/
		
	}	
}