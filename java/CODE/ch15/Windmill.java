import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="Windmill" width=300 height=300>
  </applet>
*/

public class Windmill extends Applet 
implements Runnable {
  double radians;
  boolean operate;

  public void init() {

    // Create thread to animate windmill
    Thread thread = new Thread(this);
    thread.start();

    // Anonymous inner class for mouse drags
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent me) {
        operate = true;
      }
    });

    // Anonymous inner class for mouse clicks
    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent me) {
        operate = false;
      }
    });
  }

  public void run() {
    try {
      while(true) {
        Thread.sleep(100);
        if(operate)
          repaint();
      }
    }
    catch(Exception e) {
    }
  }

  public void paint(Graphics g) {

    // Calculate length of a windmill arm
    Dimension d = getSize();
    int r = (d.width > d.height) ? d.width : d.height;
    r = (int)(0.3 * r);

    // Calculate center of display area
    int xc = d.width/2;
    int yc = d.height/2;

    // Draw vertical tower
    g.drawLine(xc, d.height, xc, yc);

    // Draw 1st arm
    int x = xc + (int)(r * Math.cos(radians));
    int y = yc - (int)(r * Math.sin(radians));
    g.drawLine(xc, yc, x, y);

    // Draw 2d arm
    x = xc + (int)(r * Math.cos(radians + Math.PI/2));
    y = yc - (int)(r * Math.sin(radians + Math.PI/2));
    g.drawLine(xc, yc, x, y);

    // Draw 3d arm
    x = xc + (int)(r * Math.cos(radians + Math.PI));
    y = yc - (int)(r * Math.sin(radians + Math.PI));
    g.drawLine(xc, yc, x, y);

    // Draw 4th arm
    x = xc + (int)(r * Math.cos(radians + 1.5 * Math.PI));
    y = yc - (int)(r * Math.sin(radians + 1.5 * Math.PI));
    g.drawLine(xc, yc, x, y);

    // Increment radians
    radians += Math.PI/180;
  }
}

