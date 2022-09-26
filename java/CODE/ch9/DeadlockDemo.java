class A {
B b;
synchronized void a1() {
System.out.println("Starting a1");
b.b2();
  }
synchronized void a2() {
System.out.println("Starting a2");
  }
}
class B {
A a;
synchronized void b1() {
System.out.println("Starting b1");
a.a2();
}
synchronized void b2() {
System.out.println("Starting b2");
  }
}
class Thread1 extends Thread {
A a;
Thread1(A a) {
this.a = a;
  }
public void run() {
for(int i = 0; i < 1000; i++)
a.a1();
  }
}
class Thread2 extends Thread {
  B b;
  Thread2(B b) {
    this.b = b;
  }
  public void run() {
    for(int i = 0; i < 1000; i++)
    b.b1();
  }
}
class DeadlockDemo {
  public static void main(String args[]) {
    // Create objects
    A a = new A();
    B b = new B();
    a.b = b;
    b.a = a;
    // Create threads
    Thread1 t1 = new Thread1(a);
    Thread2 t2 = new Thread2(b);
    t1.start();
    t2.start();
    // Wait for threads to complete
    try {
      t1.join();
      t2.join();
    }
   catch(Exception e) {
   e.printStackTrace();
    }
   // Display message
   System.out.println("Done!");
  }
}     