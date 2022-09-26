/* This  Program is a simple java Application showing how to
use shift operators on integer data types
Author : Team - J 
Version: 1.0*/

class intshift  { 
	public static void main(String args[]){
		int i=3;
		//left shift operator
		System.out.println(" i << 1 =" + (i <<1));
		System.out.println(" i << 3 =" + (i <<3));
		System.out.println(" i << 32 =" + (i <<32));//same as i
		System.out.println(" i << 33 =" + (i <<33)); //same as <<1

		i=44;
		//right shift operator
		System.out.println(" i << 1 =" + (i >>1));
		System.out.println(" i >> 32 =" + (i >>32)); //same as i
		i=255;
		System.out.println(" i >> 7 (i is 0xff) =" + (i >>7));
		System.out.println(" i >> 8 (i is 0xff) =" + (i >>8));
		// unsigned right shift 
		System.out.println(" i >>> 7 (i is 0xff) =" + (i >>>7));
		System.out.println(" i >>> 8 (i is 0xff) =" + (i >>>8));
		System.out.println(" i >>> 32 =" + (i >>32)); //same as i
		// all the above four yeilds the same result why ?
		i = -222 ;
		System.out.println(" i >> 1  =" + (i >>1));
		System.out.println(" i >> 3  =" + (i >>3));
		System.out.println(" i >>> 1  =" + (i >>>1));
		System.out.println(" i >>> 3  =" + (i >>>3));
   		System.out.println(" i >>> 32  =" + (i >>>32));//same as i
		
	}	
}