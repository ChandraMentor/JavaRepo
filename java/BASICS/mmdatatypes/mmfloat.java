/* This  Program is a simple java Application which
uses minimum and maximum values for float data type
Author : Team - J 
Version: 1.0*/

class mmfloat { 
	public static void main(String args[]){
		//float f1 = 3.40282347E+38F; //max given in book
		float f1 = 3.40282356E+38F; // max accepted when I used
	//doesn't accept 3.40282357E+38F;
		float f2 = -3.40282356E+38F; //dosn't accept xxx57
		System.out.println(" f1 = " + f1);
		System.out.println(" f2 = " + f2);
		f1=(float)(f1+ 999999.22); //explicit cast needed
		f1 = f1 + f1; //casting not needed ?
		f2++;
		System.out.println(" f1 + f1 = " + f1);//inf
		f1 = f1 + 2.3f; //no casting required
		System.out.println(" f2 = " + (f2 + f2));
		
	}	
}