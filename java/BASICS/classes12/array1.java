/* This is to demonstrate how to create arrays of primitive data type
Author : Team - J 
Version: 1.0*/

class array1  { 
	
	public static void main(String args[]) throws Exception{
		int i=55,j;
		int [] a;
		a = new int[i];
		for(j=0;j<i;j++)
			System.out.println(a[i]); // this should throw array
		//out of bound exception
	}

//causing run time error due to jvm bug ??
}
 