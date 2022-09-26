import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="MouseMotionAdapterDemo" width=100 height=100>
  </applet>
*/

public class MouseMotionAdapterDemo extends Applet {

  public void init() {
    setBackground(Color.white);
    addMouseListener(new Adapter1(this));
    addMouseMotionListener(new Adapter2(this));
  }
}

class Adapter1 extends MouseAdapter {
  MouseMotionAdapterDemo mmad;

  public Adapter1(MouseMotionAdapterDemo mmad) {
    this.mmad = mmad;
  }

  public void mouseReleased(MouseEvent me) {
    mmad.setBackground(Color.white);
    mmad.repaint();
  }
}

class Adapter2 extends MouseMotionAdapter {
  MouseMotionAdapterDemo mmad;

  public Adapter2(MouseMotionAdapterDemo mmad) {
    this.mmad = mmad;
  }

  public void mouseDragged(MouseEvent me) {
    mmad.setBackground(Color.cyan);
    mmad.repaint();
  }
}