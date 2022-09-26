// Usage:
//   java ChatClient address
// Here, address is the dotted decimal or
// dotted string form of the IP address for
// the machine that executes the ChatServer.

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class ChatClient extends Frame
implements ActionListener, Runnable {
  TextArea ta;
  TextField tf;
  BufferedReader br;
  PrintWriter pw;

  public static void main(String args[]) {

    // Create chat client
    ChatClient cc = 
      new ChatClient("ChatClient", args[0], 2000);
    cc.show();
    cc.setSize(200, 200);
  }

  ChatClient(String title, String address, int port) {

    // Invoke the superclass constructor
    super(title);

    // Handle window closing event
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });   

    // Create a text area and add it to the frame
    ta = new TextArea(10, 20);
    ta.setEditable(false);
    add(ta, "Center");

    // Create a text field and add it to the frame
    tf = new TextField("", 25);
    tf.addActionListener(this);
    add(tf, "South");

    try {  

      // Create socket
      Socket s = new Socket(address, port);

      // Create buffered reader and writer for that socket
      InputStream is = s.getInputStream();
      InputStreamReader isr = new InputStreamReader(is);
      br = new BufferedReader(isr);
      OutputStream os = s.getOutputStream();
      pw = new PrintWriter(os, true);
    }   
    catch(Exception e) {
    }
    
    // Create a thread to listen for messages from server
    Thread thread = new Thread(this);
    thread.start();
  }

  public void actionPerformed(ActionEvent ae) {

    try {

      // Write contents of text field to server
      String str = tf.getText();
      pw.println(str);

      // Clear text field
      tf.setText("");
    }
    catch(Exception e) {
    }
  }

  public void run() {

    try {

      while(true) {

        // Read a string from the server
        String str = br.readLine();

        // Append that string to the text area
        ta.append(str + "\n");
      }
    }
    catch(Exception e) {
    }
  }
}
