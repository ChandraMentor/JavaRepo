class Widget {
  double w;

  Widget(String s) {
    w = Double.valueOf(s).doubleValue();
  }

  Widget(StringBuffer sb) {
    String s = sb.toString();
    w = Double.valueOf(s).doubleValue();
  }

  Widget(double d) {
    w = d;
  }
}

class WidgetConstructors {

  public static void main(String args[])  {

    Widget w1 = new Widget("5.5");
    System.out.println(w1.w);

    StringBuffer sb = new StringBuffer("-17.8");
    Widget w2 = new Widget(sb);
    System.out.println(w2.w);

    Widget w3 = new Widget(2.5e-17);
    System.out.println(w3.w);
  }
}
    