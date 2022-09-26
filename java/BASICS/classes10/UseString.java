/* This program demonstrates the use of string class
Author : Team - J 
Version: 1.0*/

class UseString { 
	
	public static void main ( String args[]){
		String s1= new String (" String 1");
		String s2 = " String 2" , s3 = " String 2";
		String s11,s21;
		s11 = s1;
		s21 = s2;
		System.out.println( " S1 =" + s1);
		System.out.println( " S2 =" + s2);
		System.out.println( " S3 =" + s3);
		if ( s1 == s11)
			System.out.println( " s1 == s11");
		if ( s1.equals(s11))
			System.out.println( " s1 is equal to s11");
		if ( s2 == s3)
			System.out.println( " s2 == s3");
		if ( s2.equals(s3))
			System.out.println( " s1 is equal to s11");
		// concatinate two strings
		s21 = s2 + s3;
		System.out.println( " s2 + s3 = " + s21);
		// to find the length of the string
		System.out.println( " length of s1 = " + s1.length());
	}
}
 