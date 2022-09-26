class A3 {
void hello() {
 System.out.println("Hello from A3");
  }
 void hello(int i) {
 System.out.println("Hello from A3 " + i);
  }
}

class B3 extends A3 {
void hello() {
System.out.println("Hello from B3");
  }
}

class C3 extends B3 {

void hello(String s) {
System.out.println("Hello from C3 " + s);
  }
}

class MethodOverriding3 {
  public static void main(String args[]) {
   A3 obj = new B3();
    obj.hello();
  }
}