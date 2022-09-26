/* This  program demonstrates the basics of integer arithmetics.
Author : Team - J 
Version: 1.0*/

class addbytes { //let us not bother what class is //
// This main function is simailar to main function in c which is the  first
// function  called when a c program is exectued. Even though there is
// difference between c program and Java Program let us not go in to details
	public static void main(String args[]){
			byte b= 10,c=11,a=0;
			int d=0;
			
		//a=b+c; //adding two bytes to produce ??
		d=b+c; //let us check up the result in this case
		System.out.println("d  = " + d );
		a=(byte)(b+c); //what is this
		System.out.println("a  = " + a );
		
	}
}