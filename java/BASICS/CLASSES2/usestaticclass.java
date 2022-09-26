/* This  Program is a simple java Application to show
The difference between class methods and instance methods
Author : Team - J 
Version: 1.0*/

class usestaticclass  { 
	public static  void main(String args[]){
		//staticclass.method1();
		//staticclass.method2();
			//	staticclass.method3();
		staticclass s1 = new staticclass();
		System.out.println(" after creating first object");
		staticclass s2 = new staticclass();
		staticclass.method1();
		s2.method3();
	}
} 