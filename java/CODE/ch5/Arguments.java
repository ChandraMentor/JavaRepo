class Arguments {

  public static void main(String args[]) {

    StringBuffer sba = new StringBuffer("aaaaa");
    StringBuffer sbb = new StringBuffer("bbbbb");

    System.out.println("sba = " + sba);
    System.out.println("sbb = " + sbb);

    f(sba, sbb);

    System.out.println("sba = " + sba);
    System.out.println("sbb = " + sbb);
  }

  public static void f(StringBuffer sb1, StringBuffer sb2) {
    sb1 = new StringBuffer("ccccc");
    sb2.append("ddddd");
  }
}