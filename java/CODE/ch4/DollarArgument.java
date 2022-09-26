class DollarArgument {
  public static void main(String args[]) {
    for(int i = 0; i < args.length; i++) {
      if(args[i].startsWith("$")) {
        System.out.print(args[i]);
        break;
      }
    }
  }
}