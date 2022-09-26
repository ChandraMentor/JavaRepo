/* This  Program is a simple java class which
uses mytextbox class
Author : Team - J 
Version: 1.0*/

class usemytextbox { 
	public static void main(String args[]){
		mytextbox t1 ;
		mytextbox t2 = new mytextbox("iNetSolv",200,200,1,"editme");
		mywindow w1 = new mytextbox("t3");
		mywindow w2 = t2;
		w2.showwindow();
		//can we use t1 = w2  no why ??
		t1 = (mytextbox) w2;
		t1.showwindow();
		t1 = (mytextbox) w1;
		t1.showwindow();
		mywindow w3 = new mywindow();
		//does this works as the previous cast operator
		//t1 = (mytextbox) w3;
		// how to avoid error condition before applying casting
		System.out.println( " check whether w3,w1,w2 are reffering to my textbox");
	System.out.println( "Is w3 instanceof mytextbox ?: " + (w3 instanceof mytextbox));
	System.out.println( "Is w2 instanceof mytextbox ?: " + (w2 instanceof mytextbox));
	System.out.println( "Is w2 instanceof mytextbox ?: " + (w2 instanceof mytextbox));
	}
}
 