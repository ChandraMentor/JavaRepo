import java.applet.*;
import java.awt.*;
/*
  <applet code="X" width=200 height=200>
  </applet>
*/

public class X extends Applet {

  public void paint(Graphics g) {
    Dimension d = getSize();
    g.drawLine(0, 0, d.width, d.height);
    g.drawLine(d.width, 0, 0, d.height);
  }
}