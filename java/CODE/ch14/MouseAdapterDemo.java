import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="MouseAdapterDemo" width=100 height=100>
  </applet>
*/

public class MouseAdapterDemo extends Applet {

  public void init() {
    setBackground(Color.green);
    addMouseListener(new MyMouseAdapter(this));
  }
}

class MyMouseAdapter extends MouseAdapter {
  MouseAdapterDemo mad;

  public MyMouseAdapter(MouseAdapterDemo mad) {
    this.mad = mad;
  }
  
  public void mousePressed(MouseEvent me) {
    mad.setBackground(Color.red);
    mad.repaint();
  }

  public void mouseReleased(MouseEvent me) {
    mad.setBackground(Color.green);
    mad.repaint();
  }
}