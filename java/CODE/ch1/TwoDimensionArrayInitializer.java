import java.lang.String;
import java.lang.System;

class TwoDimensionArrayInitializer {
  public static void main(String args[]) {
    // Declare, allocate, initialize
    int myarray[][] = {
      { 33, 71 },
      { -16, 45 },
      { 99, 27 }
    };
    // Display length
 System.out.println("myarray.length = " + 
      myarray.length);

    // Display elements
    System.out.print(myarray[0][0]);
	System.out.print(" ");
    System.out.println(myarray[0][1]);
    System.out.print(myarray[1][0]);
    System.out.println(myarray[1][1]);
    System.out.print(myarray[2][0]);
    System.out.println(myarray[2][1]);
  }
}