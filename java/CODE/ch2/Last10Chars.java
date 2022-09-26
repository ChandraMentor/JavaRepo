class Last10Chars {
  public static void main(String args[]) {
    String s = "One Two Three Four Five Six Seven";
    int len = s.length();
    String substring = s.substring(len - 10, len);
    System.out.println(substring);
  }
}