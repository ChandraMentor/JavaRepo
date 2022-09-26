/* Program to show binary promotion
Author : Team - J 
Version: 1.0*/
class binpromo { 
	public static void main(String args[]){
		int i1=10,i2=20,i3=30;
		long l1=22,l2=3333,l3=44;
		byte b1=12,b2=33,b3;
		short s1=22,s2=33,s3;
		char c1='A',c2='B',c3;
		//error why ??b3 = b1 + b2;
		//arithmetic operators on byte data type.
		b3 = (byte)(b1 + b2);  
		s3= (short) (s1+s2) ;
		// error ?  s1 = s2 + s3;
		s3 = (byte)( s1+s2); //why is this allowed  ?
		l3= i1 + i2;
		c3= (char) (c1 + c2);
		System.out.println("c3  = "+ c3);
		i3=c1 + c2; //this is allowed
		l3= (int)(c1 + c2);
		System.out.println("i3  = "+ i3);
		i3 = (int)(l1 + i2);
		System.out.println("i3  = "+ i3);
	}	
}