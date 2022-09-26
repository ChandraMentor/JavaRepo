package h;
import f.F;
import g.G;

class ProtectedDemo {

  public static void main(String args[]) {
    
    // Test subclass in a different package
    F f = new F();
    f.display();
   
    // Test non-subclass in a different package
    G g = new G();
    g.display();
  }
}