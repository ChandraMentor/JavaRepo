import java.util.*;

class RandomDoubleVector {

  public static void main(String args[]) {

    // Create a vector
    Vector v = new Vector();

    // Generate a random int between 10 and 25
    int count = (int)(15 * Math.random() + 10);

    // Generate random double values that 
    // have a Gaussian distribution
    Random random = new Random();
    for(int i = 0; i < count; i++) {
      double d = random.nextGaussian();
      v.addElement(new Double(d));
    }

    // Display the elements in the vector
    Enumeration e = v.elements();
    while(e.hasMoreElements()) 
      System.out.println(e.nextElement());
  }
}
    