class W {
  float f;
}

class X extends W {
  StringBuffer sb;
}

class Y extends X {
  String s;
}

class Z extends Y {
  Integer i;
}

class Wxyz {
  public static void main(String args[]) {
    Z z = new Z();
    z.f = 4.567f;
    z.sb = new StringBuffer("abcde");
    z.s = "Teach Yourself Java";
    z.i = new Integer(41);
    System.out.println("z.f = " + z.f);
    System.out.println("z.sb = " + z.sb);
    System.out.println("z.s = " + z.s);
    System.out.println("z.i = " + z.i);
  }
}