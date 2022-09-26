/* This  Program is a simple java Application to show
how to instatiate a simple class
Author : Team - J 
Version: 1.0*/
import java.lang.*;
import java.io.*;
class usesimpleclass  { 
	public static void main(String args[]){
	
	//simpleclass s1 = new simpleclass(10,20);
	//s1.print();
	simpleclass s2 = new simpleclass();
	s2.print();
	s2.member1=11;
	s2.member2=22;
	s2.print();
	System.out.println("value of mem1 = "+ s2.member1);
	System.out.println("value of mem2 = "+ s2.member2);
	}
}