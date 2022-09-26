/* This  Program is a simple java Application which
shows how to java performs arithmetic operations on long and int
Author : Team - J 
Version: 1.0*/   

class lon { 
	public static void main(String args[]){
		int i=229,j=33;
		long l1=20L;byte a = (byte)299;
		char b1=0xf098,b2=100;
	/*	i= i + j ; // This executes without any problem.
		l1 = i + j; //converts i + j to long
		l1 = i + l2; //i will be converted to long before addition
		//i = l1 + l2; // what happens ? why ?
		//i =(int) l1 + l2; //what happens ? why ?
		i =(int) (l1 + l2);
		i = b1 + b2;// here b1 and b2 are converted to integers*/
		l1 = b1 + b2; //here b1 and b2 are converted to int first
		//and result of addition will be converted to long before
		//assigning the value to l1
	}	
}