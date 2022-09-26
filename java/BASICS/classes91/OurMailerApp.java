/* This is an application (very flexibly designed to take 
addresses from any source.
Author : Team - J 
Version: 1.0*/

class OurMailerApp { 
	public static void main ( String args[]) throws Exception{
		// if the user wants to use ourlook express he will be configuring
		// the application according to that.
		System.out.println(args[0]);
		Class c = Class.forName(args[0]);
		IAddressBook ia = (IAddressBook ) c.newInstance(); // This creates the object.
		// This application when it wants to send mail can use any of the source
		// since we are using an interface here.
		System.out.println(ia.getAddress(1));	
	}
}
 