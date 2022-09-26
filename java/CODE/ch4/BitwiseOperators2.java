class BitwiseOperators2 {
  public static void main(String args[]) {
    short s = 0xff;
    System.out.println(s);
    System.out.println(s & 0xf);
    System.out.println(s | 1);
    System.out.println(s ^ 1);
    System.out.println(~s);
    System.out.println(s >> 2);
    System.out.println(s >>> 2);
    System.out.println(s << 2);
  }
}
