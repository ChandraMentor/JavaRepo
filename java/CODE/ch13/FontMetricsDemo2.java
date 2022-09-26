import java.applet.*;
import java.awt.*;
/*
  <applet code="FontMetricsDemo2" width=300 height=200>
  </applet>
*/

public class FontMetricsDemo2 extends Applet {

  public void paint(Graphics g) {
    
    // Draw baseline
    int baseline = 100;
    g.setColor(Color.lightGray);
    g.drawLine(0, baseline, 300, baseline);

    // Draw string
    Font font = new Font("SansSerif", Font.PLAIN, 18);
    g.setFont(font);
    g.setColor(Color.black);
    g.drawString("Wxyz", 5, baseline);
    g.setColor(Color.lightGray);

    // Get FontMetrics
    FontMetrics fm = g.getFontMetrics(font);

    // Draw line at baseline - ascent
    int ascent = fm.getAscent();
    int y = baseline - ascent;
    g.drawLine(0, y, 300, y);

    // Draw line at baseline + descent
    int descent = fm.getDescent();
    y = baseline + descent;
    g.drawLine(0, y, 300, y);

    // Draw line at baseline + descent + leading
    int leading = fm.getLeading();
    y = baseline + descent + leading;
    g.drawLine(0, y, 300, y);

    // Draw line at baseline + height
    int height = fm.getHeight();
    y = baseline + height;
    g.drawLine(0, y, 300, y);

    // Draw string
    g.setColor(Color.black);
    g.drawString("\"'?/^{9}|[0]*@#", 5, y);
    g.setColor(Color.lightGray);

    // Draw line at baseline + height + descent
    y = baseline + height + descent;
    g.drawLine(0, y, 300, y);
  }
}
