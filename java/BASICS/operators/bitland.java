/* Program using boolean logical operator with booleans
Author : Team - J 
Version: 1.0*/

class bitland { 
	public static void main(String args[]){
		boolean True=true,False=false,res=false;
		int i =10,j=20,k=22,f;
		// and 
		System.out.println(" true & true = " + (True & True));
		System.out.println(" true & false = " + (True & False));
		System.out.println(" false & true = " + (False & True));
		System.out.println(" false & false = " + (False & False));
		
		//or
		System.out.println(" true | true = " + (True | True));
		System.out.println(" true | false = " + (True | False));
		System.out.println(" false | true = " + (False | True));
		System.out.println(" false | false = " + (False | False));

		//exor
		System.out.println(" true ^ true = " + (True ^ True));
		System.out.println(" true ^ false = " + (True ^ False));
		System.out.println(" false ^ true = " + (False ^ True));
		System.out.println(" false ^ false = " + (False ^ False));
		System.out.println("res = " + res);
		System.out.println("=======================");
		// to avoid side effects
		if ((i > j) & (res=(k >j)))
			System.out.println("in if res = " + res);
		System.out.println("not in if res = " + res);
		System.out.println("=======================");
		res=false;
		if ((i > j) && (res=(k >j)))
			System.out.println("in if res = " + res);
		System.out.println("not in if res = " + res);
		//or operator
		res=false;
		if ((i < j) | (res=(k >j)))
			System.out.println("in if res = " + res);
		System.out.println("not in if res = " + res);
		System.out.println("=======================");
		res=false;
		if ((i < j) || (res=(k >j)))
			System.out.println("in if res = " + res);
		System.out.println("not in if res = " + res);
	}	
}