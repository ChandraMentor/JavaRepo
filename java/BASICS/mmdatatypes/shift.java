/* This  Program is a simple java Application showing that
>> ,<< cannot be used on float and double.
Author : Team - J 
Version: 1.0*/

class shift  { 
	public static void main(String args[]){
		float a = 22.22f;
		double d =33.33;
		//float b= a<<2;//error ?
		//int c = (int)(a <<2); //error ?
		int c = (int)a <<2;
		c = (int)d<<1;
		System.out.println(" c = " + c);
	}	
}