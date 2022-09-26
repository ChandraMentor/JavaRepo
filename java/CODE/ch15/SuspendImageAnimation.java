import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="SuspendImageAnimation" width=280 height=280>
  <param name="count" value="4">
  <param name="file0" value="slide0.jpg">
  <param name="file1" value="slide1.jpg">
  <param name="file2" value="slide2.jpg">
  <param name="file3" value="slide3.jpg">
  <param name="msec" value="1000">
  </applet>
*/

public class SuspendImageAnimation extends Applet
implements Runnable {
  int count;
  Image images[];
  int msec;
  int index;
  boolean suspendFlag;
 
  public void init() {

    // Read the count parameter 
    String str = getParameter("count");
    count = Integer.parseInt(str);

    // Allocate and initialize array of images
    images = new Image[count];
    for(int i = 0; i < count; i++) {
      String filename = getParameter("file" + i);
      images[i] = getImage(getDocumentBase(), 
        filename);
    }

    // Read msec parameter
    str = getParameter("msec");
    msec = Integer.parseInt(str);

    // Create and start thread
    Thread thread = new Thread(this);
    thread.start();

    // Register to process mouse clicks
    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent me) {
        suspendFlag = !suspendFlag;
      }
    });
  }
    
  public void paint(Graphics g) {
    g.drawImage(images[index], 0, 0, this);
  }

  public void run() {
    try {
      while(true)  {
        Thread.sleep(msec);
        if(suspendFlag)
          continue;
        ++index;
        if(index >= count)
          index = 0;
        repaint();
      }
    }
    catch(Exception e) {
    }
  }
}