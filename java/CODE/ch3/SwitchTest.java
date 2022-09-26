public class SwitchTest {
  public static void main(String[] args) {
    for (String argument : args) {
      switch (argument) {
      case "-verbose":
      case "-v":
        System.out.println("verbose");
        break;
      case "-log":
        System.out.println("logging");
        break;
      case "-help":
        System.out.println("displayHelp");
        break;
      default:
        System.out.println("Illegal command line argument");
      }

    }
  }
}
