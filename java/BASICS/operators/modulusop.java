/* Program using modulus operator with float and int arithmetics
Author : Team - J 
Version: 1.0*/

class modulusop { 
	public static void main(String args[]){
		int i1=10,i2=22,i3=30;
		byte b1 = 10,b2=22,b3;
		float f1=10.0f,f2=13.0f,f3=98090.90f;
		double d1=12.22,d2=33.33,d3=98090.90;
		//modlus on int
		i3 = i2 % i1;
		System.out.println(" 22 % 10  =  " + i3);
		//b3 = b2 % b1; error ???
		//b3 = (byte) b2 % b1; error ???
		b3 =(byte)( b2 % b1);
		System.out.println(" 22 % 10  (short) =  " + (b2 % b1));
		//modulus on float 
		f3= f2 % f1; //not valid in c language but valid in java
		System.out.println(" 12.0 % 10.0   =  " + f3);
		i3 =(int)( f2 % f1);
		System.out.println(" 12.0 % 10.0  (int)  =  " + i3);
	}	
}