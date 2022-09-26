/* Program to show float and int arithmetics
Author : Team - J 
Version: 1.0*/

class floatint { 
	public static void main(String args[]){
		int i1=10,i2=20,i3=30;
		long l1=22,l2=3333,l3=44;
		byte b1=12,b2=33,b3;
		short s1=22,s2=33,s3;
		char c1='A',c2='B',c3;
		float f1=12.22f,f2=33.33f,f3=98090.90f;
		double d1=12.22,d2=33.33,d3=98090.90;
		
		f3 = b1 + b2;  
		d3 = b1 + b2;  
		System.out.println("d3  = "+ d3);
		System.out.println("f3  = "+ f3);
		f3=(s1+s2) ;
		System.out.println("f3  = "+ f3);
		f3= i1 + i2;
		System.out.println("f3  = "+ f3);
		d3=c1 + c2; 
		System.out.println("d3  = "+ d3);
		l3= (c1 + c2);
		System.out.println("l3  = "+ l3);
		f3= l2 + i1; //i1 will be converted to float
		System.out.println("f3  = "+ f3);
		d3= f1 + f2;
		System.out.println("d3  = "+ d3);
		d3 = i1 +d2;
		System.out.println("d3  = "+ d3);
		
	}	
}