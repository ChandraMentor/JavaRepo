/* This  Program is a simple java Application which
uses minimum and maximum values for int data type
Author : Team - J 
Version: 1.0*/

class mmchar { 
	public static void main(String args[]){
		char c1 = '\u0000';
		char c2 = '\uffff'; 
		System.out.println(" c1 = " + (int)c1);
		System.out.println(" c2 = " + (int)c2);
		c1--;
		c2++;
		System.out.println(" c1 = " +(int) c1);
		System.out.println(" c2 = " +(int)c2); 

	}	
}