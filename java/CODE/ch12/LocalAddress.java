import java.net.*;

class LocalAddress {

  public static void main(String args[]) {

    try {

      // Get local name and address
      InetAddress ia = InetAddress.getLocalHost();
      String name = ia.getHostName();
      System.out.println(name);
      String address = ia.getHostAddress();
      System.out.println(address); 
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}