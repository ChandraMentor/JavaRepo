class P {
  static int x;
}

class Q extends P {
  static String x;
}

class Pq {
  public static void main(String args[]) {
    P p = new P();
    p.x = 55;
    System.out.println("p.x = " + p.x);
    Q q = new Q();
    q.x = "This is a string";
    System.out.println("q.x = " + q.x);
  }
}