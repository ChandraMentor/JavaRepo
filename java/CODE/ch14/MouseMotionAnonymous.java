import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="MouseMotionAnonymous" width=100 height=100>
  </applet>
*/

public class MouseMotionAnonymous extends Applet {

  public void init() {
    setBackground(Color.white);
    addMouseListener(new MouseAdapter() {
      public void mouseReleased(MouseEvent me) {
        setBackground(Color.white);
        repaint();
      }
    });
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent me) {
        setBackground(Color.cyan);
        repaint();
      }
    });
  }
}