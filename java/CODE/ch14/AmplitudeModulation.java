import java.applet.*;
import java.awt.*;
/*
  <applet code="AmplitudeModulation" width=300 height=200>
  </applet>
*/

public class AmplitudeModulation extends Applet {

  public void paint(Graphics g) {

    // Draw axes
    g.setColor(Color.lightGray);
    Dimension d = getSize();
    int width = d.width;
    int height = d.height;
    g.drawRect(0, 0, width - 1, height - 1);
    g.drawLine(0, height/2, width, height/2);
    g.drawLine(width/2, 0, width/2, height - 1);

    // Draw waveform
    g.setColor(Color.blue);
    double dx = 4 * Math.PI / width;
    double x = -2 * Math.PI;
    for(int i = 0; i < width - 1; i++) {
      double f1 = Math.sin(x) * Math.sin(10 * x);
      double f2 = Math.sin(x + dx) * Math.sin(10 * (x + dx));
      int y1 = (int)((height - height * f1) / 2);
      int y2 = (int)((height - height * f2) / 2);
      g.drawLine(i, y1, i + 1, y2);
      x += dx;
    }
  }
}