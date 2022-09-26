/* This  Program is a simple java Application which
shows how to compare two integer data types and shows difference
between java and c comparision operators
Author : Team - J 
Version: 1.0*/

class ieq { 
	public static void main(String args[]){
		int i=22,j=33;
		//following is intrepreted as assignment operator
		System.out.println("i=j   " + (i=j)); 
		//following is intrepreted as is equal operator
		System.out.println("i==j   " + (i==j));
		//both the above are okay try using if(i=j) 
		if(i == j)
			System.out.println("do nothing");
		//if we try to cast int  to boolean we will get error as
		//there is no cast from int to boolean.
		//if((boolean)(i=j))
			//System.out.println("compilation error");
	}	
}