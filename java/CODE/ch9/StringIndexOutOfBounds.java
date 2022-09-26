class StringIndexOutOfBounds {

  public static void main(String args[]) {

    try {

      String s = "This is a string";
      int length = s.length();
      System.out.println(s.charAt(length));
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}