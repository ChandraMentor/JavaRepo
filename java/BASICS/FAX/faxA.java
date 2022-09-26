/* This  Program is a simple java class which
extendes other class
Author : Team - J 
Version: 1.0*/

class faxA extends genfax  { 
	//int faxno;
	//public genfax(int faxno){
	//	this.faxno = faxno;
	//}
	//public void callfax(int otherfax){
	//	System.out.println(" Calling other fax no :" + otherfax);
	//}
	//public void receivefax(int otherfax){
		//System.out.println(" Receiving fax from  other fax no :" + otherfax);
	//}
	// here in java we don't know how to destruct an object so forget about
	// destructors;
	//We don't need to write any thing if we want to use the same functionality as
	//genfax
	public faxA(int faxno){
		// constructors are not inherited by sub classes so 
		// call the super class constructor
		super (faxno);
	}
}
 