import java.applet.Applet;
import java.awt.Graphics;
/*
  <applet code="DrawPolygon" width=200 height=200>
  </applet>
*/

public class DrawPolygon extends Applet {

  public void paint(Graphics g) {
    int n = 5;
    int xdata[] = new int[n];
    int ydata[] = new int[n];
    xdata[0] = 10;   
    ydata[0] = 100;
    xdata[1] = 60;   
    ydata[1] = 10;
    xdata[2] = 70;   
    ydata[2] = 140;
    xdata[3] = 140;   
    ydata[3] = 90;
    xdata[4] = 190;   
    ydata[4] = 10;
    g.drawPolygon(xdata, ydata, n);
  }
}