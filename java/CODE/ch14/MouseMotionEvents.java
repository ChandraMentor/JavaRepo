import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="MouseMotionEvents" width=300 height=300>
  </applet>
*/

public class MouseMotionEvents extends Applet 
implements MouseListener, MouseMotionListener {
  Point p;

  public void init() {
    addMouseListener(this);
    addMouseMotionListener(this);
  }
  
  public void mouseClicked(MouseEvent me) {
  }

  public void mouseEntered(MouseEvent me) {
  }

  public void mouseExited(MouseEvent me) {
  }
  
  public void mousePressed(MouseEvent me) {
    p = me.getPoint();
    repaint();
  }

  public void mouseReleased(MouseEvent me) {
    p = null;
    repaint();
  }
  
  public void mouseDragged(MouseEvent me) {
    p = me.getPoint();
    repaint();
  }

  public void mouseMoved(MouseEvent me) {
  }

  public void paint(Graphics g) {
    if(p != null) {
      Dimension d = getSize();
      int xc = d.width/2;
      int yc = d.height/2;
      g.drawLine(xc, yc, p.x, p.y);
    }
  }
}