class ShortDemo {
  public static void main(String args[]) {
    String strOctal = "77";
    String strHex = "23";
    String strDecimal = "156";
    short o = Short.parseShort(strOctal, 8);
    short h = Short.parseShort("23", 16);
    short d = Short.parseShort(strDecimal, 10);
    int sum = o + h + d;
    System.out.println("The sum is " + sum);
  }
}