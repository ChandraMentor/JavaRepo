/* This program demonstrates the use of string class
Author : Team - J 
Version: 1.0*/
import sun.io.ByteToCharConverter;
class UseString { 
	
	public static void main ( String args[]) throws Exception{
		byte b[] = {-126,67,-68,01,22,22,-66,32,22,34}; // we are using an array initializer
		String s1= new String (" String 1");
		String s2 = " String 2" , s3 = " String 2";
		//String(byte[],hibyte) dep in 1.1
		String sb  = new String (b,0x00);
		System.out.println( " sb =" + sb); 
		//String(byte[] bytes, int offset, int length) 
		String sb1  = new String (b,0,3); 
		System.out.println( " sb1 =" + sb1);
		System.out.println(" default encoding scheme on this platform =  "+ByteToCharConverter.getDefault());
		//String(byte[] bytes,String enc);
		String sb2  = new String (b,"Cp037");//what is this ??
		System.out.println( " sb2.length =" + sb2.length());
		//String sb3  = new String (b,"ISO8859_2");
		String sb3  = new String (b,"EUC_JP"); // why sb3's length is 7 ?
		System.out.println( " sb3.length =" + sb3.length()+sb3 );
		char ca[] = {'i','N','e','t'};
		String sc = new String(ca);
		System.out.println( " sc =" + sc);
		String s11,s21;
		s11 = s1;
		s21 = s2;
		
		System.out.println( " S1 =" + s1);
		System.out.println( " S2 =" + s2);
		System.out.println( " S3 =" + s3);
		//check to see if both are referring same String object or not
		if ( s1 == s11)
			System.out.println( " s1 == s11");
		//Check whether s1 and s2 are pointing to string with same content
		if ( s1.equals(s11))
			System.out.println( " s1 is equal to s11");
		if ( s2 == s1)
			System.out.println( " s2 == s1");
		else
			System.out.println( " s2 != s1");
		if ( s2.equals(s3))
			System.out.println( " s1 is equal to s11");
		// concatinate two strings
		s21 = s2 + s3;
		System.out.println( " s2 + s3 = " + s21);
		// to find the length of the string
		System.out.println( " length of s1 = " + s1.length());
	}
}
 