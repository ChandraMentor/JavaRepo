import java.lang.*;
//Demonstration of Multiple if
class EvenOdd {
public static void main(String args[]) {
int i = Integer.parseInt(args[0]);

if((i % 2) == 0) 
System.out.print("Even");
else if((i % 2) == 1)
System.out.print("Odd");
else if ((i % 2) == -1)
System.out.print("Odd");
else
System.out.print("Not a valid input");
  }
}