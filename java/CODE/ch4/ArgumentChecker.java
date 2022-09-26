class ArgumentChecker {
  public static void main(String args[]) {
    for(int i = 0; i < args.length; i++) {
      char ch = args[i].charAt(0);
      if(!Character.isLetter(ch) ||
        !Character.isUpperCase(ch)) {
        System.out.print("Arguments must begin " +
          "with an upper case letter");
        break;
      }
    }
  }
}