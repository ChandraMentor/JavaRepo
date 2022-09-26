package g;
import e.*;

public class G {

  public void display() {

    // Create an instance of E
    E e = new E();

    // OK to access public member
    System.out.println(e.e1);

    // Not OK to access protected member 
    // System.out.println(e.e2);

    // Not OK to access private member
    // System.out.println(e.e3);
  }
}
