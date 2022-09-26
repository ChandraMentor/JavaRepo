class SpanishTranslator {

  static String translate(String english) {

    // Perform translation
    String spanish;
    english = english.toLowerCase();
    if(english.equals("one"))
      spanish = "Uno";
    else if(english.equals("two"))
      spanish = "Dos";
    else if(english.equals("three"))
      spanish = "Tres";
    else if(english.equals("four"))
      spanish = "Quatro";
    else if(english.equals("five"))
      spanish = "Cinco";
    else 
      spanish = "Unknown";
    return spanish;
  }
}

class SpanishTranslatorDemo {
  public static void main(String args[]) {
    String s = SpanishTranslator.translate(args[0]);
    System.out.println(s);
  }
}