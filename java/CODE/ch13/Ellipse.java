import java.applet.*;
import java.awt.*;
import java.net.*;
/*
  <applet code="Ellipse" width=200 height=200>
  <param name="major" value=140>
  <param name="minor" value=70>
  </applet>
*/
public class Ellipse extends Applet {
  public void paint(Graphics g) {
    String major = getParameter("major");
    String minor = getParameter("minor");
    int majoraxis = Integer.parseInt(major);
    int minoraxis = Integer.parseInt(minor);
    Dimension d = getSize();
    int x = d.width/2 - majoraxis/2;
    int y = d.height/2 - minoraxis/2;
    g.drawOval(x, y, majoraxis, minoraxis);
  }
}
