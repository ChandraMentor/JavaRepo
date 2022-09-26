import java.util.*;

class HashtableDemo {

  public static void main(String args[]) {

    // Create a hashtable and populate it
    Hashtable hashtable = new Hashtable();
    hashtable.put("apple", "red");
    hashtable.put("strawberry", "red");
    hashtable.put("lime", "green");
    hashtable.put("banana", "yellow");
    hashtable.put("orange", "orange");

    // Display the elements of the hashtable

    Enumeration e = hashtable.keys();
    while(e.hasMoreElements()) {
      Object k = e.nextElement();
      Object v = hashtable.get(k);
      System.out.println("key = " + k + "; value = " + v);
    } 

    // Display the value for 'apple'
    //System.out.print("\nThe color of an apple is: ");
    //Object v = hashtable.get("apple");
    //System.out.println(v);
  }
}
    