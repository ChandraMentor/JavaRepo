import java.lang.*;

class ThrowsDemo {
public static void main(String args[]) {
//method calling
a();
 }
public static void a() {
try {
b();
}
catch(ClassNotFoundException e) {
//System.out.println("Error");
e.printStackTrace();
    }
  }
public static void b() throws ClassNotFoundException {
c();
}
public static void c() throws ClassNotFoundException {
Class cls = Class.forName("ThrowsDem");
System.out.println(cls.getName());
System.out.println(cls.isInterface());
  }
}