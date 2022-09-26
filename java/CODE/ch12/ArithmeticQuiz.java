import java.io.*;

class ArithmeticQuiz {
  static BufferedReader br;

  public static void main(String args[]) {

    try {

      // Get a buffered reader for the standard input
      InputStreamReader isr = 
        new InputStreamReader(System.in);
      br = new BufferedReader(isr);
    
      while(true) {

        // Create operands and operator
        int i = (int)(12 * Math.random());
        int j = (int)(12 * Math.random());
        int op = (int)(2 * Math.random());
     
        // Create question
        String q;
        int a;
        if(op < 1) {
          q = i + " + " + j + " ?";
          a = i + j;
          question(q, a);
        }
        else {
          q = i + " - " + j + " ?";
          a = i - j;
          question(q, a);
        }
      }
    }
    catch(Exception e) {
      e.printStackTrace();
      return;
    }
  }

  static void question(String q, int a) 
  throws IOException {

    // Display question
    System.out.println(q);
   
    // Get user input
    String str = br.readLine();

    // Check answer and provide feedback
    int answer = Integer.parseInt(str);
    if(answer == a)
      System.out.println("Correct!");
    else {
      System.out.print("Incorrect! ");
      System.out.println("The answer is " + a);
    }
  }
}
      