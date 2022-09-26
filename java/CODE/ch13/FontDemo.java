import java.applet.*;
import java.awt.*;
/*
  <applet code="FontDemo" width=200 height=200>
  </applet>
*/

public class FontDemo extends Applet {

  public void paint(Graphics g) {

    // Draw baseline
    int baseline = 100;
    g.setColor(Color.lightGray);
    g.drawLine(0, baseline, 200, baseline);

    // Draw string
    g.setFont(new Font("Serif", Font.BOLD, 36));
    g.setColor(Color.black);
    g.drawString("Wxyz", 5, baseline);
  }
}