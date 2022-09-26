/* This  Program is a simple java Application which
shows how to use literals in java (char type)
Author : Team - J 
Version: 1.0*/

class charlit { 
	public static void main(String args[]){
		char c1='a'; //valid
		c1='\b';
	// all the statements below does the same
	System.out.println("I may get\b\b\b erased");
	System.out.println("I may get" +"\b\b\b"+" erased");			System.out.println("I may get" +c1 + c1 + c1+" erased");
System.out.println("I may get" +'\u0008' +'\u0008'+'\u0008'+" erased");
		c1='\"';
	System.out.println("I may get" +c1 + c1 + c1+" erased");
		c1='\\';
	System.out.println("I may get" +c1 + c1 + c1+" erased");
		//c1='\'; is this allowed ?
		c1 = '\'';
	System.out.println("I may get" +c1 + c1 + c1+" erased");
		c1='\t';
	System.out.println("I may get" +c1 + c1 + c1+" erased");
		c1='\n';
	System.out.println("I may get" +c1 + c1 + c1+" erased");
		c1='\r';
	System.out.println("I may get" +c1+" erased");
	System.out.println("I may get" +c1 +'\n'+" erased"); //same as \n
	}	
}