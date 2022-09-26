/* This  Program is a simple java Application to show
The difference between class methods and instance methods
Author : Team - J 
Version: 1.0*/

class staticclass  { 
	static int member1=1;
	 int member2=2;
	public static void method1(){
		System.out.println(" i am in method1 ");
		System.out.println(" value of static memeber 1 = " + member1);
		//System.out.println(" value of  memeber 2 = " + member2); ??
	}
	private static void method2(){
		System.out.println(" i am in method2 ");
		System.out.println(" value of static memeber 1 = " + member1);
	}
	public void method3(){
		System.out.println(" i am in method3 ");
		System.out.println(" value of static memeber 1 = " + member1);
		System.out.println(" value of static memeber 2 = " + member2);
		method4();
		method2();
	}
	private void method4(){
		System.out.println(" i am in method4 ");
		System.out.println(" value of static memeber 1 = " + member1);
		System.out.println(" value of static memeber 2 = " + member2);
	}

	{
		System.out.println(" member 1 in initializer " + member1);
		member1=222;
		member2=111;
	}
	static {
		member1=22;
		System.out.println(" I am in static initializer");
	}
} 