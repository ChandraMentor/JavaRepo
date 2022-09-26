/* This  Program is a simple java class which
will be  extended by other class
Author : Team - J 
Version: 1.0*/

class genfax  { 
	int faxno;
	public genfax(int faxno){
		this.faxno = faxno;
	}
	public void callfax(int otherfax){
		System.out.println(" Calling other fax no :" + otherfax);
	}
	public void receivefax(int otherfax){
		System.out.println(" Receiving fax from  other fax no :" + otherfax);
	}
	// here in java we don't know how to destruct an object so forget about
	// destructors;
}
 