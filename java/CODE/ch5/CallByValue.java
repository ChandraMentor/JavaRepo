class CallByValue {

  public static void main(String args[]) {

    // Initialize variables
    int i = 5;
    int j[]  = { 1, 2, 3, 4 };
    StringBuffer sb = new StringBuffer("abcde");

    // Display variables
    display(i, j, sb);

    // Call method
    a(i, j, sb);
    
    // Display variables again
    display(i, j, sb);
  }

  static void a(int i, int j[], StringBuffer sb) {
    i = 7;
    j[0] = 11;
    sb.append("fghij");
  }

  static void display(int i, int j[], StringBuffer sb) {
    System.out.println(i);
    for(int index = 0; index < j.length; index++)
      System.out.print(j[index] + " ");
    System.out.println("");
    System.out.println(sb);
  }
}