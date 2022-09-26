interface I1 {
}

interface I2 {
}

interface I3 extends I1, I2 {
}

interface I4 {
}

class X implements I3 {
}

class W extends X implements I4 {
}

class InstanceofTest {
  public static void main(String args[]) {
    W w = new W();
    if(w instanceof I1)
      System.out.println("w implements I1");
    if(w instanceof I2)
      System.out.println("w implements I2");
    if(w instanceof I3)
      System.out.println("w implements I3");
    if(w instanceof I4)
      System.out.println("w implements I4");
    if(w instanceof X)
      System.out.println("w is an instance of X");
  }
}
