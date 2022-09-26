/* Program using "if" construct showing difference between
Java and C
Author : Team - J 
Version: 1.0*/

class iferror { 
	public static void main(String args[]){
		int i;
		i=22 +33;
		// The below if compiles
		if (i > 22){
			System.out.println("i is greater than 22");
		}
		else{
			System.out.println("i is less than 22");
		}
		if (1) 
			System.out.println("in if(1)");
		System.out.println("====end====");
	}	
}