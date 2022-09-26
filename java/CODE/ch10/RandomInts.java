import java.util.*;
class RandomInts {
public static void main(String args[]) {
  // Create random number generator
 Random generator = new Random();
// Generate and display 10 random integers
 for(int i=0; i<10; i++)
System.out.println(generator.nextInt());
  }
}