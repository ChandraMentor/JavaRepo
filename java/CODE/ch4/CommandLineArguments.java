class CommandLineArguments {
  public static void main(String args[]) {
    int count = 0;
    for(int i = 0; i < args.length; i++) 
      count += args[i].length();
    System.out.println("Total number of characters: " +
      count);
  }
}