import java.applet.*;
import java.awt.*;
/*
  <applet code="Harmonics" width=400 height=200>
  </applet>
*/

public class Harmonics extends Applet  {

  public void paint(Graphics g) {

    // Draw rectangle around the display area
    Dimension d = getSize();
    int width = d.width;
    int height = d.height;
    g.setColor(Color.blue);
    g.drawRect(0, 0, width - 1, height - 1);

    // Draw lines for x and y axes
    int y = height/2;
    g.drawLine(0, y, width, y);
    g.drawLine(width/2, 0, width/2, height);

    // Compute data values and remember 
    // max and min values
    double max = 0;
    double min = 0;
    double deltax = 2 * Math.PI/(width - 1);
    double x = -Math.PI;
    double data[] = new double[width];
    for(int i = 0; i < width; i++) {
      double value = f(x);
      data[i] = value;
      min = (value < min) ? value : min;
      max = (value > max) ? value : max;
      x += deltax;
    }

    // Scale and translate data values
    double scale = height/(max - min);
    for(int i = 0; i < width; i++) {
      double value = data[i];
      double k = (value - min)/(max - min);
      data[i] = height * (1 - k);
    }

    // Draw curve for data values
    g.setColor(Color.black);
    for(int i = 1; i < width; i++) {
      g.drawLine(i - 1, (int)data[i - 1], i, (int)data[i]);
    }
  }

  private double f(double x) {
    double value = 0;
    for(int i = 0; i < 4; i++) {
        value += ((double)1/(i + 1)) * Math.sin((i+1) * x);
    }
    return value;
  }
}
