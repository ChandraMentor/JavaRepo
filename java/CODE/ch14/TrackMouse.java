import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="TrackMouse" width=300 height=300>
  </applet>
*/

public class TrackMouse extends Applet 
implements MouseMotionListener {
  Point p;

  public void init() {
    addMouseMotionListener(this);
  }
  
  public void mouseDragged(MouseEvent me) {
    p = me.getPoint();
    repaint();
  }

  public void mouseMoved(MouseEvent me) {
    p = me.getPoint();
    repaint();
  }

  public void paint(Graphics g) {
    if(p != null) {
      g.fillRect(p.x - 10, p.y - 10, 10, 10);
    }
  }
}
