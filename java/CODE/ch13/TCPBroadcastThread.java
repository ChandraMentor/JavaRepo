import java.io.*;
import java.net.*;
import java.util.*;

class TCPBroadcastThread extends Thread {
  Vector dataOutputStreams = new Vector();

  public void run() {

    try {

      // Create an infinite loop
      while(true) {

        // Sleep for 2 seconds
        Thread.sleep(2000);

        // Generate a random integer
        int r = (int)(100 * Math.random());

        // Send value to each output stream
        Enumeration e = dataOutputStreams.elements();
        while(e.hasMoreElements()) {
          try {
            DataOutputStream dos;
            dos = (DataOutputStream)e.nextElement();
            dos.writeInt(r);
          }
          catch(Exception e1) {
          }
        }
      }
    }
    catch(Exception e2) {
    }
  }

  void addDataOutputStream(DataOutputStream dos) {
    dataOutputStreams.addElement(dos);
  }
}
  
        
    