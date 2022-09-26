class S1 {
  int s1;
  S1() {
  System.out.println("S1 Constructor");
  s1 = 1;
  }
}

class T1 extends S1 {
  int t1;
  T1() {
 System.out.println("T1 Constructor");
  t1 = 2;
  }
}

class U1 extends T1 {
  int u1;
  U1() {
System.out.println("U1 Constructor");
  u1 = 3;
  }
}

class InheritanceAndConstructors1 {
public static void main(String args[]) {

U1 u1 = new U1();
System.out.println("u1.s1 = " + u1.s1);
System.out.println("u1.t1 = " + u1.t1);
System.out.println("u1.u1 = " + u1.u1);
  }
}