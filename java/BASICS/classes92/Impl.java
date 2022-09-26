/* This is an application (very flexibly designed to take 
addresses from any source.
Author : Team - J 
Version: 1.0*/

class Impl implements IX,IY { 
	public int m1(){
		//System.out.println(var1); // ambiguous ???
System.out.println(IX.var1); 
System.out.println(IY.var1); 

		return 10;
	}
	public int m2(){
		System.out.println(" thanks for calling me");
		return 5;
	}
}
 