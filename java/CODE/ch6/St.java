class S {
  Integer x;
}

class T extends S {
  StringBuffer x;
}

class St {
  public static void main(String args[]) {
    S s = new S();
    s.x = new Integer(5);
    System.out.println("s.x = " + s.x);
    T t = new T();
    t.x = new StringBuffer("Hello");
    System.out.println("t.x = " + t.x);
  }
}