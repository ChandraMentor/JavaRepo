import java.applet.*;
import java.awt.*;
/*
  <applet code="CenterString" width=300 height=200>
  </applet>
*/

public class CenterString extends Applet {

  public void paint(Graphics g) {

    // Set string
    String s = "Teach Yourself Java";

    // Create and set font
    Font f = new Font("SansSerif", Font.BOLD, 20);
    g.setFont(f);

    // Get font metrics
    FontMetrics fm = g.getFontMetrics();

    // Calculate starting position of string
    Dimension d = getSize();
    int x = d.width/2 - fm.stringWidth(s)/2;
    int y = d.height/2 + fm.getDescent();

    // Draw string    
    g.drawString(s, x, y);
  }
}