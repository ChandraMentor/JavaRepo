import java.applet.*;
import java.awt.*;
/*
  <applet code="CanvasDemo2" width=501 height=200>
  </applet>
*/

class MyCanvas2 extends Canvas {

  public void paint(Graphics g) {

    // Draw axes
    g.setColor(Color.lightGray);
    Dimension d = getSize();
    g.drawRect(0, 0, d.width - 1, d.height - 1);
    g.drawLine(0, d.height/2, d.width, d.height/2);
    g.drawLine(d.width/2, 0, d.width/2, d.height - 1);

    // Draw waveform
    g.setColor(Color.blue);
    double dx = 4 * Math.PI / d.width;
    double x = -2 * Math.PI;
    int h = d.height;
    for(int i = 0; i < d.width - 1; i++) {
      double f1 = Math.sin(10 * x) * Math.sin(x);
      double f2 = Math.sin(10 * (x + dx)) * Math.sin(x + dx);
      int y1 = (int)((h - h * f1) / 2);
      int y2 = (int)((h - h * f2) / 2);
      g.drawLine(i, y1, i + 1, y2);
      x += dx;
    }
  }
}

public class CanvasDemo2 extends Applet {

  public void init() {
    MyCanvas2 myCanvas2 = new MyCanvas2();
    myCanvas2.setSize(401, 150);
    add(myCanvas2);
  }
}