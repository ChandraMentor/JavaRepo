class BitwiseOperators {
  public static void main(String args[]) {
    char c = 'A';
    byte b = 100;
    short s = 100;
    int i = -100;
    long lo = 100;
    System.out.println(c & 0xf);
    System.out.println(b | 1);
    System.out.println(s ^ 1);
    System.out.println(~i);
    System.out.println(lo | 1);
    System.out.println(i >> 2);
    System.out.println(s >>> 2);
    System.out.println(i << 2);
  }
}
