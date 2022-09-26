import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="CircleMaker" width=300 height=300>
  </applet>
*/

public class CircleMaker extends Applet { 
  int xc, yc, x, y;
  boolean down;
  int radius;

  public void init() {
    // Set background color
    setBackground(Color.white);

    // Define anonymous inner class for
    // mouse events
  addMouseListener(new MouseAdapter() {
  public void mousePressed(MouseEvent me) {
        xc = me.getX();
        yc = me.getY();
        down = true;
      }
      public void mouseReleased(MouseEvent me) {
        down = false;
      }
    });

    // Define anonymous inner class for
    // mouse motion events
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent me) {
        int dx = Math.abs(xc - me.getX());
        int dy = Math.abs(yc - me.getY());
        radius = (dx > dy) ? dx : dy;
        repaint();
      }
    });
  }

  public void paint(Graphics g) {
    if(down) 
      g.drawOval(xc - radius, yc - radius, 2 * radius, 2 * radius);
  }  
}