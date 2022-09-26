import java.applet.*;
import java.awt.*;
/*
  <applet code="MovingDot" width=250 height=250>
  </applet>
*/

public class MovingDot extends Applet 
implements Runnable {
double radians=0;
Thread t;

  public void init() {
    // Start thread
   t = new Thread(this);
   t.start();
  }
  public void run() {
  try {
     while(true) {
        // Request a repaint
        repaint();
        // Sleep before moving dot
        Thread.sleep(100);
      }
    }
    catch(Exception e) {
    }
  }
  public void paint(Graphics g) {
    // Compute center of applet
    Dimension d = getSize();
    int xcenter = d.width/2;
    int ycenter = d.height/2;
    // Calculate position of dot
int x = xcenter + (int)(100 * Math.cos(radians));
int y = ycenter - (int)(100 * Math.sin(radians));
// Draw dot
g.fillRect(x-2, y-2, 5, 5);
// Increment radians
radians += Math.PI/180;
  }
}