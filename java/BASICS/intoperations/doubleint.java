/* This  Program is a simple java Application which
shows how to java performs arithmetic operations on double,float
Author : Team - J 
Version: 1.0*/

class doubleint { 
	public static void main(String args[]){
		//float i=22.0,j=33.0; //is this okay ?
		float i=22.0F,j=33.0F;
		long l1=20L,l2=30L;
		double b1=90.9,b2=100.9;
		i= i + j ; // This executes without any problem.
		//l1 = i + j; //does this converts i + j to long ? why ?
		l1 =(long)( i + j); //explicit cast needed
		//l1 = i + l2; //what happens here ?
		l1 = (long) (i +l2);//l2 will be conveterted to float
		//i = l1 + l2; // what happens ? why ?
		//i =(int) l1 + l2; //what happens ? why ?
		i =(float) (b1 + b2);
		i = l1 + l2;// here l1 +l2 will be converted to float
		l1 = (long)(b1 + b2); // b1 + b2 has to be casted to long
		b1 = l1 + l2; //no cast is needed here
		b1 =(double) l1 + (double)l2; 
	}	
}