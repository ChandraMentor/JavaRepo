import java.applet.Applet;
import java.awt.Graphics;
/*
  <applet code="DrawArc" width=200 height=200>
  </applet>
*/

public class DrawArc extends Applet {

  public void paint(Graphics g) {
    g.drawArc(20, 20, 160, 160, 0, 135);
  }
}
