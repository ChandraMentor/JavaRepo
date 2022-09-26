import java.applet.*;
import java.awt.*;
/*
  <applet code="DrawRectangle" width=500 height=300>
  </applet>
*/

public class DrawRectangle extends Applet {

  public void paint(Graphics g) {
    g.drawRect(100, 50, 300, 200);
  }
}