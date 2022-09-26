class LastNumber {
  public static void main(String args[]) {
    String s1 = "67.89,55.87,-56.45,11.22,78.9";
    int i1 = s1.lastIndexOf(',');
    String s2 = s1.substring(i1 + 1);
    System.out.println(s2);
  }
}
    
    