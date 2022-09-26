/* Program using bitwise operator with int data types
Author : Team - J 
Version: 1.0*/

class bitrs { 
	public static void main(String args[]){
		//you can use any no as int but to make it easy
		// to understand we have taken -2147483648 for int and byte
		int i =-2147483648;
		byte b=-128;
		System.out.println(" i>>1 = " + (i >>1));
		System.out.println(" i>>2 = " + (i >>2));
		System.out.println(" i>>10 = " + (i >>10));
		System.out.println(" i>>31 = " + (i >>31));
		System.out.println(" i>>32 = " + (i >>32)); //result??
		System.out.println(" i>>33 = " + (i >>33));//i >>1 ?
		System.out.println(" i>>42 = " + (i >>42));// = i >>10 ?

		//bitwise using byte
		System.out.println(" b>>1 = " + (byte)(b >>1));
		System.out.println(" b>>2 = " + (byte)(b >>2));
		System.out.println(" b>>10 = " +(byte) (b >>10));
		System.out.println(" b>>31 = " +(byte) (b >>31));
		System.out.println(" b>>32 = " +(byte) (b >>32)); //result??
		System.out.println(" b>>33 = " + (byte)(b >>33));//b <<1 ?
		System.out.println(" b>>42 = " + (byte)(b >>42));//b <<10 ?
		
		// shall we try b >>8 which is max bits + 1
		System.out.println(" b>>9 = " + (byte)(b >>8));
		System.out.println(" b>>8 = " + (byte)(b >>7));
	}	
}