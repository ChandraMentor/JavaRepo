import java.applet.*;
import java.awt.*;
/*
  <applet code="AppletParameters" width=300 height=300>
  <param name="background" value="0xff0000">
  <param name="foreground" value="0x0000ff">
  <param name="message" value="Testing Applet Parameters">
  </applet>
*/

public class AppletParameters extends Applet {

  public void paint(Graphics g) {
    String background = getParameter("background");
    String foreground = getParameter("foreground");
    String message = getParameter("message");
    setBackground(Color.decode(background));
    setForeground(Color.decode(foreground));
    Font font = getFont();
    FontMetrics fm = getFontMetrics(font);
    Dimension d = getSize();
    int x = (d.width - fm.stringWidth(message))/2;
    int y = d.height/2;
    g.drawString(message, x, y); 
  }
}