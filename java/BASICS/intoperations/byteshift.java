/* This  Program is a simple java Application showing how to
use shift operators on integer data types (byte)
Author : Team - J 
Version: 1.0*/

class byteshift  { 
	public static void main(String args[]){
		byte i=3;  
		//byte j =i <<3; error ??
		//left shift operator
		System.out.println(" i << 1 =" + (i <<1));
		System.out.println(" i << 3 =" + (i <<3));
	System.out.println(" i << 8 =" + (i <<8));//is this same as i ?
	System.out.println(" i << 9 =" + (i <<9)); //is this same as <<1 ?
	System.out.println(" i << 8 =" +(byte) (i <<8)); //???
	System.out.println(" i << 9 =" +(byte) (i <<9)); //???

		i=44;
		//right shift operator
		System.out.println(" i << 1 =" + (i >>1));
		System.out.println(" i >> 8 =" + (i >>8)); 
		i=127;
		System.out.println(" i >> 7 (i is 0xff) =" + (i >>7));
		System.out.println(" i >> 8 (i is 0xff) =" + (i >>8));
		// unsigned right shift 
		System.out.println(" i >>> 7 (i is 0xff) =" + (i >>>7));
		System.out.println(" i >>> 8 (i is 0xff) =" + (i >>>8));
		System.out.println(" i >>> 8 =" + (i >>8));
		// all the above four yeilds the same result why ?
		i = -22 ;
		System.out.println(" i >> 1  =" + (i >>1));
		System.out.println(" i >> 3  =" + (i >>3));
		System.out.println(" i >>> 1  =" + (i >>>1));
		System.out.println(" i >>> 3  =" + (i >>>3));
   		System.out.println(" i >>> 8  =" + (i >>>8));//same as i
		
	}	
}