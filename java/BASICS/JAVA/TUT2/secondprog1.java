/* This Program shows the maximum value that an integer variable
can take 
Author : Team - J 
Version: 1.0*/

class secondprog1 { //let us not bother what class is //

	public static void main (String args []){
		// declare three variables ires,ivar1 and ivar2 as integer
		//int ivar1;
		//int ivar2;
		//int ires;
		int ivar1,ivar2,ires; //declaring multiple variables
				// in single declare statement
		// store 2147483646 in variable ivar1 and 2 in ivar2
		ivar1= 2147483646;
		ivar2= 2147483646;
		//store 2147483648 in ivar1 and see what happens
		ires=ivar1+ivar2; //results in a wrong value why ?
		System.out.println("value of ires = "+ires);
	}
}