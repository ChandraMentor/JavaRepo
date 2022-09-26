/* A simple sub class
Author : Team - J 
Version: 1.0*/

class  App{
	public static void main(String args[]){
		SupVar sup;
		SubVar sub = new SubVar();
		sub.m1();
		System.out.println(sub.var1);
		sup = sub;
		sup.m1();
		System.out.println(sup.var1);
	}
}
 