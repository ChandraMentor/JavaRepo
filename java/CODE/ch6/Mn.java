class M {
  float f;
  String str;
}

class N extends M {
  Double d1;
}

class Mn {
  public static void main(String args[]) {
    N obj = new N();
    obj.f = 34.5f;
    obj.str = "This is a string";
    obj.d1 = new Double(-23.45e-2);
    System.out.println("obj.f = " + obj.f);
    System.out.println("obj.str = " + obj.str);
    System.out.println("obj.d1 = " + obj.d1);
  }
}