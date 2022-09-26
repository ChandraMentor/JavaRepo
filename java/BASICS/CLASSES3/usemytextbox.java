/* This  Program is a simple java class which
uses mytextbox class
Author : Team - J 
Version: 1.0*/

class usemytextbox { 
	public static void main(String args[]){
		mytextbox t1 = new mytextbox();
		mytextbox t2 = new mytextbox("iNetSolv",200,200,1,"editme");
		mytextbox t3 = new mytextbox("t3");
		String s;
		System.out.println(" ---- textbox t1 Details -----");
		t1.showwindow();
		System.out.println(" ---- textbox t2 Details -----");
		t2.showwindow();
		System.out.println(" ---- Window t3 Details -----");
		t3.showwindow();
		s= t2.getTitle();
		System.out.println(" Title of the textbox t2 = " + s);
		System.out.println(" text in t2  " + t2.getText());
		// can we cast textbox object to it's parent class?
		mywindow w1 = t1;
		w1.showwindow();
		//System.out.println(" text in t2  " + w1.getText()); can we use like this ?
	}
}
 