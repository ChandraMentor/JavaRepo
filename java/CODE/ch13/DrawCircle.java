import java.applet.*;
import java.awt.*;
/*
  <applet code="DrawCircle" width=500 height=300>
  </applet>
*/

public class DrawCircle extends Applet {

  public void paint(Graphics g) {
    g.drawOval(150, 50, 200, 200);
  }
}