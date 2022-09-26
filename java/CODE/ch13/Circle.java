import java.applet.*;
import java.awt.*;
/*
  <applet code="Circle" width=200 height=200>
  </applet>
*/

public class Circle extends Applet {

  public void paint(Graphics g) {
    Dimension d = getSize();
    int xc = d.width/2;
    int yc = d.height/2;
    int radius = (int)((d.width < d.height) ? 
      0.4 * d.width : 0.4 * d.height);
    g.drawOval(xc - radius, yc - radius, 2 * radius, 2 * radius);
  }
}