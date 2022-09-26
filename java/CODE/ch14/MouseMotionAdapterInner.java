import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="MouseMotionAdapterInner" width=100 height=100>
  </applet>
*/

public class MouseMotionAdapterInner extends Applet {

  public void init() {
    setBackground(Color.white);
    addMouseListener(new Adapter1());
    addMouseMotionListener(new Adapter2());
  }

  class Adapter1 extends MouseAdapter {

    public void mouseReleased(MouseEvent me) {
      setBackground(Color.white);
      repaint();
    }
  }

  class Adapter2 extends MouseMotionAdapter {

    public void mouseDragged(MouseEvent me) {
      setBackground(Color.cyan);
      repaint();
    }
  }
}