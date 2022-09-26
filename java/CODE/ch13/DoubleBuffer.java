import java.applet.*;
import java.awt.*;
/*
  <applet code="DoubleBuffer" width=300 height=100>
  </applet>
*/
public class DoubleBuffer extends Applet 
implements Runnable {
 int x = 0;
Thread t;
Image buffer;
Graphics bufferg;

public void init() {
// Start thread
t = new Thread(this);
t.start();
// Create buffer
Dimension d = getSize();
buffer = createImage(d.width, d.height);
  }
  public void run() {
    try {
      while(true) {
        // Request a repaint
        repaint();
        // Sleep before update
        Thread.sleep(100);
      }
    }
    catch(Exception e) {
    }
  }
  public void update(Graphics g) {
    paint(g);
  }
  public void paint(Graphics g) {
    // Get graphics object for buffer
    if(bufferg == null)
   bufferg = buffer.getGraphics();
    // Draw to buffer
    Dimension d = getSize();
    bufferg.setColor(Color.blue);
    bufferg.fillRect(0, 0, d.width, d.height);
    bufferg.setColor(Color.yellow);
    bufferg.fillOval(x, d.height/4, 50, 50);
    // Update screen
    g.drawImage(buffer, 0, 0, this);
    // Increment x
    x += 5;
    if(x + 50 > d.width)
      x = 0;
  }
}