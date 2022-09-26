import java.util.*;

class StringTokenizerDemo {

  public static void main(String args[]) {

    String str = 
      "123/45.6/-11.2/41/-90.1/100/99.99/-50/-20";
    StringTokenizer st = new StringTokenizer(str, "/");
    while(st.hasMoreTokens()) {
      String s = st.nextToken();
      System.out.println(s);
    }
  }
}