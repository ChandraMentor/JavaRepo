/* Program using bitwise operator ~ with int data types
Author : Team - J 
Version: 1.0*/

class bitcomp { 
	public static void main(String args[]){
		//you can use any no as int but to make it easy
		// to understand we have taken -2147483648 for int and byte
		int i =-2147483648;
		byte b=-128;
		System.out.println(" ~i = " + ~i);
		System.out.println(" ~b = " + ~b);
		i=1;
		b=1;
		System.out.println(" ~1(int) = " + ~i);
		System.out.println(" ~1(byte) = " + ~b);
	}	
}