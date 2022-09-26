import java.net.*;

class InetAddressDemo {

  public static void main(String args[]) {
    try {

      // Get an address
      InetAddress ias[] = 
        InetAddress.getAllByName(args[0]);
      for(int i = 0; i < ias.length; i++) {
        System.out.println(ias[i].getHostName());
        System.out.println(ias[i].getHostAddress());
        byte bytes[] = ias[i].getAddress();
        for(int j = 0; j < bytes.length; j++) {
          if(j > 0)
            System.out.print(".");
          if(bytes[j] >= 0)
            System.out.print(bytes[j]);
          else
            System.out.print(bytes[j] + 256);
        }
        System.out.println("");
      }

    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}