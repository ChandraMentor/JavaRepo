/* This program demonstrates the use of StringBuffer class
Author : Team - J 
Version: 1.0*/
import java.util.*;
class UseStringBuffer { 
	
	public static void main ( String args[]){
		StringBuffer s1= new StringBuffer(" String 1");
		StringBuffer s2= new StringBuffer(" String 2");	
		StringBuffer s3= new StringBuffer(" String 2");	
		StringBuffer s11,s21;
		s11 = s1;
		s21 = s2;
		System.out.println( " S1 =" + s1);
		System.out.println( " S2 =" + s2);
		System.out.println( " S3 =" + s3);
		if ( s1 == s11) // identity comparision
			System.out.println( " s1 == s11");
		if ( s1.equals(s11))//equivalance comparision
			System.out.println( " s1 is equal to s11");
		if ( s2 == s3)
			System.out.println( " s2 == s3");
		if ( s2.equals(s3))
			System.out.println( " s1 is equal to s11");
		// concatinate two strings -- why is this not valid
		//s21 = s2 + s3;
		//System.out.println( " s2 + s3 = " + s21);
	}
}
 