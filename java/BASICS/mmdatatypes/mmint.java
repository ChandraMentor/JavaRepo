/* This  Program is a simple java Application which
uses minimum and maximum values for int data type
Author : Team - J 
Version: 1.0*/

class mmint { 
	public static void main(String args[]){
		int i1 = -2147483648  ;
		int i2 = 2147483647  ;
		System.out.println(" i1 = " + i1);
		System.out.println(" i2 = " + i2);
		i1--;
		i2++;
		System.out.println(" i1 = " + i1);
		System.out.println(" i2 = " + i2);
		/* try to assign -2147483649 to i1 and check what happens 
		when you compile your program*/
		
	}	
}