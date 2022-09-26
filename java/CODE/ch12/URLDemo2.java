import java.net.*;

class URLDemo2 {
  private final static int BUFSIZE = 20;

  public static void main(String args[]) {
    try {

      // Obtain url
      URL url = new URL(args[0]);

      // Obtain protocol, host, port, file
      String protocol = url.getProtocol();
      String host = url.getHost();
      int port = url.getPort();
      String file = url.getFile(); 

      // Display data
      System.out.println("url = " + url);
      System.out.println("protocol = " + protocol);
      System.out.println("host = " + host);
      System.out.println("port = " + port);
      System.out.println("file = " + file);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}