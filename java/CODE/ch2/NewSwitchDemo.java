import java.lang.String;
import java.lang.System;
import java.util.Scanner;

class NewSwitchDemo{
	public static void main(String[] args){
    String str;
	System.out.println("Enter the value");
	Scanner s = new Scanner(System.in);
	str=s.next();

	switch(str) {
	   case "java":
		  System.out.println("Java is selected");
	   break;
	   case "jee" :
		  System.out.println("JEE is selected");
	   break;
	   case "android" :
		   System.out.println("Android is selected");
       break;
	   case "oracle" :
		   System.out.println("Oracle is selected");
	   break;
	   default:
		   System.out.println("Invalid choice");
		}//end of switch

	}//end of main
}//end of class
