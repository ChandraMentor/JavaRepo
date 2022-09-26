class CallByValue2 {

  public static void main(String args[]) {

    // Initialize variables
    StringBuffer sb = new StringBuffer("abcde");

    // Display variable
    System.out.println(sb);

    // Call method
    a(sb);
    
    // Display variable again
    System.out.println(sb);
  }

  public static void a(StringBuffer sb) {
    sb = new StringBuffer("wxyz");
  }
}