/* This  program demonstrates the use of bitwise operators.
Author : Team - J 
Version: 1.0*/

class bitprog { //let us not bother what class is //
// This main function is simailar to main function in c which is the  first
// function  called when a c program is exectued. Even though there is
// difference between c program and Java Program let us not go in to details
	public static void main(String args[]){
			int a=44,b=38,d=0;
			
		//bitwise unary NOT
			
		System.out.println("~a  = " + ~a );

		//bitwise AND
		d=a & b;
		System.out.println("a & b =" + d);
		
		//bitwise OR
		d=a | b;
		System.out.println("a | b =" + d);
		
		//bitwise Exclusive OR
		d=a ^ b;
		System.out.println("a ^ b =" + d);
		
		//shift right
		d=a >>2;
		System.out.println("a >> 2 =" + d);

		//shift left
		d=a <<2;
		System.out.println("a >> 2 =" + d);
		
		//shift right fill zero
		a=44;
		d=a >>>2;
		System.out.println("a >>> 2 =" + d);
		
		
		
	}
}