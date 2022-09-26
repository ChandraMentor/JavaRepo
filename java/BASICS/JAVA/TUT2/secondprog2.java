/* This Program shows how to declare and use a char data type
Author : Team - J 
Version: 1.0*/

class secondprog2 { //let us not bother what class is //

	public static void main (String args []){
		// declare three variables cres,cvar1 and cvar2 as character
		//char  ivar1;
		//char  ivar2;
		//char  ires;

		char cvar1,cvar2,cres; //declaring multiple variables
				// in single declare statement
		//declare an integer
		int ires;
		// store 2147483646 in variable ivar1 and 2 in ivar2
		cvar1= 'A';
		cvar2= 'b';
		//cres= cvar1+cvar2; //this is an error
		cres= (char)(cvar1+cvar2); //Is it possible to add a to b
		ires= (short)cres;
		System.out.println("value of cres = "+cres);
		System.out.println("value of ires = "+ires);
		System.out.println("value of cvar1 = "+(short)cvar1);
		System.out.println("value of cvar2 = "+(short)cvar2);
	}
}