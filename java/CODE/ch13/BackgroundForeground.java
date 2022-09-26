import java.applet.*;
import java.awt.*;
/*
  <applet code="BackgroundForeground" width=200 height=200>
  </applet>
*/

public class BackgroundForeground extends Applet {
  
  public void paint(Graphics g) {
    setBackground(Color.yellow);
    setForeground(Color.blue);
    g.drawLine(0, 0, 200, 200);
    g.fillRect(100, 40, 50, 50);
  }
}