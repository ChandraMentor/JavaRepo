import java.applet.Applet;
import java.awt.Graphics;
/*
  <applet code="DrawLines" width=200 height=200>
  </applet>
*/

public class DrawLines extends Applet {

  public void paint(Graphics g) {
    g.drawLine(50, 50, 200, 200);
    g.drawLine(0, 0, 100, 200);
    g.drawLine(0, 200, 180, 20);
  }
}