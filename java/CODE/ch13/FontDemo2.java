import java.applet.*;
import java.awt.*;
/*
  <applet code="FontDemo2" width=250 height=200>
  </applet>
*/

public class FontDemo2 extends Applet {

  public void paint(Graphics g) {

    // Draw baseline
    int baseline = 100;
    g.setColor(Color.lightGray);
    g.drawLine(0, baseline, 250, baseline);

    // Draw string
    g.setFont(new Font("SansSerif", Font.ITALIC, 80));
    g.setColor(Color.black);
    g.drawString("Wxyz", 5, baseline);
  }
}
