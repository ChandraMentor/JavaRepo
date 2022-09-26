import java.applet.*;
import java.awt.*;

/*
  <applet code="CanvasDemo" width=501 height=200>
  </applet>
*/

class MyCanvas extends Canvas {

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
      int y1 = (int)((h - h * Math.sin(x)) / 2);
      int y2 = (int)((h - h * Math.sin(x + dx)) / 2);
      g.drawLine(i, y1, i + 1, y2);
      x += dx;
    }
  }
}

public class CanvasDemo extends Applet {

  public void init() {
    MyCanvas myCanvas = new MyCanvas();
    myCanvas.setSize(401, 150);
    add(myCanvas);
  }
}