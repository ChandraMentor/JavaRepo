import java.util.*;

class RandomSeed {

  public static void main(String args[]) {

    // Create 1st random number generator
    Random generator = new Random(100);

    // Generate and display 10 random integers
    System.out.println("First generator:");
    for(int i = 0; i < 10; i++)
      System.out.println(generator.nextInt());

    // Create 2nd random number generator
    generator = new Random(100);

    // Generate and display 10 random integers
    System.out.println("Second generator:");
    for(int i = 0; i < 10; i++)
      System.out.println(generator.nextInt());
  }
}

