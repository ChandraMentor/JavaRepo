package f;
import e.*;

public class F extends E {

  public void display() {

    // OK to access public member
    System.out.println(e1);

    // OK to accesss protected member 
    // in our superclass
    System.out.println(e2);

    // Not OK to acces private member
    // System.out.println(e3);
  }
}