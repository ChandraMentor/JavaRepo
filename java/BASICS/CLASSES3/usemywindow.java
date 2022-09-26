/* This  Program is a simple java class which
uses mywindow class
Author : Team - J 
Version: 1.0*/

class usemywindow  { 
	public static void main(String args[]){
		mywindow w1 = new mywindow();
		mywindow w2 = new mywindow("iNetSolv");
		mywindow w3 = new mywindow("iNetSolv",200,200,1);
		String s;
		System.out.println(" ---- Window w1 Details -----");
		w1.showwindow();
		System.out.println(" ---- Window w2 Details -----");
		w2.showwindow();
		System.out.println(" ---- Window w3 Details -----");
		w3.showwindow();
		s= w2.getTitle();
		System.out.println(" Title of the window w2 = " + s);
	}
}
 