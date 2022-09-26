import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*
  <applet code="BlueString" width=300 height=100>
  </applet>
*/

public class BlueString extends Applet {

  public void paint(Graphics g) {
    g.setColor(Color.blue);
    g.drawString("Blue String", 100, 50);
  }
}