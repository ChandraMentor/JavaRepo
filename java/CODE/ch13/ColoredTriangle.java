import java.applet.Applet;
import java.awt.*;
/*
  <applet code="ColoredTriangle" width=400 height=200>
  </applet>
*/

public class ColoredTriangle extends Applet {

  public void paint(Graphics g) {
    int n = 3;
    int xdata[] = new int[n];
    int ydata[] = new int[n];
    xdata[0] = 50;   
    ydata[0] = 150;
    xdata[1] = 200;   
    ydata[1] = 50;
    xdata[2] = 350;   
    ydata[2] = 150;
    int rgb = Color.HSBtoRGB(1.0f, 1.0f, 1.0f);
    g.setColor(new Color(rgb));
    g.fillPolygon(xdata, ydata, n);
  }
}