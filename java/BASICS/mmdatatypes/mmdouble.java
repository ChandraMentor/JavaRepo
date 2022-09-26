/* This  Program is a simple java Application which
uses minimum and maximum values for float data type
Author : Team - J 
Version: 1.0*/

class mmdouble { 
	public static void main(String args[]){
		//double d1 = 1.79769313486231570E308; //max given in book
	double d1 = 1.79769313486231580E+308; // max accepted when I used
	//doesn't accept 3.40282357E+38F;
		double d2 = -1.79769313486231580E+308; //dosn't accept 57
		System.out.println(" d1 = " + d1);
		System.out.println(" d2 = " + d2);
		d1=d1+198888E100; 
		d2++;
		System.out.println(" d1 = " +( d1+198888E287));//inf
		System.out.println(" d2 = " + d2); 
		
	}	
}