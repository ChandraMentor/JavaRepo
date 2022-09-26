import java.applet.*;
import java.awt.*;
/*
  <applet code="Momentum" width=250 height=250>
  </applet>
*/

public class Momentum extends Applet
implements Runnable {

  // Size of square in pixels
  final static int SIZE = 10;

  // Applet height and width
  int h, w;

  // Position of upper left square position
  int x, y;

  // Square velocity
  int vx, vy;

  // Background buffer
  Image buffer;

  // Graphics context for background buffer
  Graphics bufferg;

  // Reference to thread
  Thread t;

  public void init() {

    // Determine size of applet
    Dimension d = getSize();
    h = d.height;
    w = d.width;

    // Create background buffer 
    buffer = createImage(w, h);

    // Initialize x, y
    x = (int)((w - SIZE) * Math.random());
    y = (int)((h - SIZE) * Math.random());

    // Initialize vx, vy
    vx = 1;
    vy = 1;

    // Start thread
    t = new Thread(this);
    t.start();
  }

  public void run() {

    try {

      while(true) {

        // Sleep for 50 msec
        Thread.sleep(50);

        // Repaint applet
        repaint();
      }
    }
    catch(Exception e) {
    }
  }

  public void update(Graphics g) {
    paint(g);
  }

  public void paint(Graphics g) {

    // Get graphics context for buffer
    if(bufferg == null) 
      bufferg = buffer.getGraphics();

    // Clear buffer
    bufferg.clearRect(0, 0, w, h);

    // Draw border
    bufferg.setColor(Color.black);
    bufferg.drawRect(0, 0, w - 1, h - 1);

    // Update x, y
    x += vx;
    y += vy;

    // Update x, vx
    if(x + vx > w - SIZE) {
      vx = -vx;
    }
    else if(x + vx < 0) {
      vx = -vx;
    }
    x += vx;

    // Update y, vy
    if(y + vy > w - SIZE) {
      vy = -vy;
    }
    else if(y + vy < 0) {
      vy = -vy;
    }
    y += vy;
      
    // Draw rectangle
    bufferg.setColor(Color.blue);
    bufferg.fillRect(x, y, SIZE, SIZE);

    // Copy background buffer to screen
    g.drawImage(buffer, 0, 0, null);
  }
}