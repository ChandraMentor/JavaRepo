class I1 {
void hello(String s) {
System.out.println("I1 value is: " + s);
 }
}
class J1 extends I1 {
void hello(String s) {
super.hello(s);
System.out.println("J1: " + s);
  }
}
class K1 extends J1 {
void hello(String s) {
super.hello(s);
System.out.println("K1: " + s);
  }
}

class SuperForMethods1 {
public static void main(String args[]) {

K1 obj= new J1();
obj.hello("Good Evening");
  }
}