/* This is to demonstrate how to create arrays of primitive data type
Author : Team - J 
Version: 1.0*/

class array2  { 
	
	public static void main(String args[]) throws Exception{
		int i=5,j;
		int [] a;
		a = new int[i];
		int b[][] = new int[5][10]; 
		for(j=0;j<i;j++)
			System.out.println(a[j]);
		System.out.println(" length of array a = " + a.length);
		for(j = 0 ; j <b.length ; j++){
			System.out.println(" length of array b [ "+ j+" ]" + b[j].length);
		}
	}
}
 