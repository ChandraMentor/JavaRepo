import java.util.*;

class ReverseVector {

  public static void main(String args[]) {

    // Create a vector
    Vector v = new Vector();

    // Convert the arguments to Double objects
    // and store them in the vector
    for(int i = 0; i < args.length; i++) {
      v.addElement(new Double(args[i]));
    }

    // Display the elements in reverse order
    for(int i = v.size() - 1; i >= 0; i--) {
      System.out.print(v.elementAt(i) + " ");
    }
  }
}
    