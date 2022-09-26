class MissingBreaks {
  public static void main(String args[]) {
    int i = 3;
    switch(i) {
    case 5:
      System.out.println("Greater than 4");
    case 4:
      System.out.println("Greater than 3");
    case 3:
      System.out.println("Greater than 2");
    case 2:
      System.out.println("Greater than 1");
    case 1:
      System.out.println("Greater than 0");
      break;
    default:
      System.out.println("Greater than 5" +
        " or negative");
    }
  }
}