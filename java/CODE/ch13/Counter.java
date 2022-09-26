import java.applet.*;
import java.awt.*;
/*
  <applet code="Counter" width=250 height=100>
  </applet>
*/

public class Counter extends Applet 
implements Runnable {
  int counter;
  Thread t;

  public void init() {

    // Initialize counter
    counter = 0;

    // Start thread
    t = new Thread(this);
    t.start();
  }

  public void run() {
    try {
      while(true) {

        // Request a repaint
        repaint();

        // Sleep before displaying next count
        Thread.sleep(1000);

        // Increment counter
        ++counter;
      }
    }
    catch(Exception e) {
    }
  }

  public void paint(Graphics g) {

    // Set font
    g.setFont(new Font("Serif", Font.BOLD, 36));

    // Get font metrics
    FontMetrics fm = g.getFontMetrics();
    
    // Display counter
    String str = "" + counter;
    Dimension d = getSize();
    int x = d.width/2 - fm.stringWidth(str)/2;
    g.drawString(str, x, d.height/2);
  }
}