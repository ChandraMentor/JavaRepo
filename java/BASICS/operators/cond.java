/* Program using modulus operator with float and int arithmetics
Author : Team - J 
Version: 1.0*/

class cond { 
	public static void main(String args[]){
		float f1=10.0f,f2=13.0f,f3=98090.90f,f4=111,t1,t2;
		f3 =(f1>f2) ?f1:f2;
		System.out.println(" f3 =  " + f3);
		// f2 >f1 ? f2 : f1 returns greatest of f1 and f2
		// the above result when compared with f3 gives the
		//max of three if written as shown below
		f3= (f4 >(f2 >f1 ? f2 : f1) )? f4 : (f2 >f1 ? f2 : f1);
		System.out.println(" f3 =  " + f3);
		// let us see how to write a test case to test your program
		f1=22;f2=33;f4=0;
		f3= (f4 >(f2 >f1 ? f2 : f1) )? f4 : (f2 >f1 ? f2 : f1);
		System.out.println(" f3 =  " + f3);
		f1=11;f2=44;f4=12;
		f3= (f4 >(f2 >f1 ? f2 : f1) )? f4 : (f2 >f1 ? f2 : f1);
		System.out.println(" f3 =  " + f3);
		f1=11;f2=11;f4=11;
		f3= (f4 >(f2 >f1 ? f2 : f1) )? f4 : (f2 >f1 ? f2 : f1);
		System.out.println(" f3 =  " + f3);
		// Now let us see how a new programer can write complex 
		// statements like the above.  
		// find the max of f1 and f2
		f1=11;f2=44;f4=12;
		t1= f1>f2? f1: f2; //now t1 holds max of f1 and f2
		t2= f4 > t1? f4: t1; //now t2 holds max of f4, f1 and f2
		System.out.println(" t2 =  " + t2 + "t1 =  " +t1);
		//now if you observe the above two statements you can
		// easily figure out how to write the same in a single 
		//statement, just substitute the first expression where
		// ever you are using the value of t1 in second expression
		t2= (f4 > (f1>f2? f1: f2))? f4: (f1>f2? f1: f2);
		System.out.println(" t2 =  " + t2);
		
	}	
}