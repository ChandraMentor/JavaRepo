/* This  Program is a simple java Application which
shows how to compare two integer data types (this shows
some typical casses . Same rules applies to all the other
comparision operators in java
Author : Team - J 
Version: 1.0*/

class icomp { 
	public static void main(String args[]){
		int i=22,j=33;
		byte k=22,l=33;
		short a=99,b=98;
		char c='A',d='B';
		float f=22.22F;
		System.out.println(" int comp i < j   " + (i<j));
		//i <j returns bollean values true or false
		// C language the same operator returns 0 or 1
		// all the variables are converted to integer before 
		//comparision
		System.out.println(" char comp    " + (c<d));
		System.out.println(" byte comp    " + (k<l));
		System.out.println(" short comp  " + (a<b));
		//int will be converted to float before comparisson
		System.out.println(" float and int  comp  " + (f>i));
	}	
}