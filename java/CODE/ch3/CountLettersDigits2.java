class CountLettersDigits2 {
  public static void main(String args[]) {
    int digits = 0;
    int letters = 0;
    for(int i = 0; i < args[0].length(); i++) {
      char ch = args[0].charAt(i);
      if(Character.isDigit(ch)) 
        ++digits;
      else if(Character.isLetter(ch))
        ++letters;
    }
    System.out.println("There are " + digits + 
      " digits");
    System.out.println("There are " + letters + 
      " letters");
  }
}