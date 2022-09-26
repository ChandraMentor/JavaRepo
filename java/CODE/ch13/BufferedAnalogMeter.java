import java.applet.*;
import java.awt.*;
/*
  <applet code="BufferedAnalogMeter" width=400 height=200>
  <param name="amplitude" value="8">
  <param name="frequency" value="0.5">
  <param name="max" value="10">
  <param name="min" value="-10">
  </applet>
*/

public class BufferedAnalogMeter extends Applet 
implements Runnable {

  // Declare variables for meter range
  double max, min;

  // Declare variables for sine wave
  double amplitude, frequency;

  // Declare variables
  double value;
  double time;
  Thread t;

  // Declare buffer and graphics
  Image buffer;
  Graphics bufferg;

  public void init() {

    // Read parameters for sine wave
    String samplitude = getParameter("amplitude");
    amplitude = Double.valueOf(samplitude).doubleValue();
    String sfrequency = getParameter("frequency");
    frequency = Double.valueOf(sfrequency).doubleValue();

    // Read parameters for meter range
    String smax = getParameter("max");
    max = Double.valueOf(smax).doubleValue();
    String smin = getParameter("min");
    min = Double.valueOf(smin).doubleValue();

    // Determine size of applet
    Dimension d = getSize();
    int h = d.height;
    int w = d.width;

    // Create background buffer 
    buffer = createImage(w, h);

    // Start thread
    t = new Thread(this);
    t.start();
  }

  public void run() {
    try {
      while(true) {

        // Compute radians
        double radians = 2 * Math.PI * frequency * time/1000;

        // Compute current value of the sine wave
        value = amplitude * Math.sin(radians);

        // Compute interval between samples
        long interval = (long)(10/frequency);

        // Update time
        time += interval;

        // Request update of screen
        repaint();

        // Sleep until next sample
        Thread.sleep(interval);
      }
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }

  public void update(Graphics g) {
    paint(g);
  }

  public void paint(Graphics g) {

    // Determine size of applet
    Dimension d = getSize();
    int h = d.height;
    int w = d.width;

    // Get graphics context for buffer
    if(bufferg == null) 
      bufferg = buffer.getGraphics();

    // Clear buffer
    bufferg.clearRect(0, 0, w, h);

    // Compute radius of dial arc
    int r1 = (int)(0.4 * w);
    int r2 = (int)(0.8 * h);
    int radius = (r1 < r2) ? r1 : r2;

    // Draw arc representing the dial
    int centerx = (int)(w * 0.5);
    int centery = (int)(h * 0.9);
    int xa = centerx - radius;
    int ya = centery - radius;
    bufferg.drawArc(xa, ya, 2 * radius, 2 * radius, 0, 180);

    // Draw line representing the base of the meter
    bufferg.drawLine(centerx - radius, centery, 
      centerx + radius, centery);

    // Compute position of needle
    double angle;
    if(value > max) {
      angle = 180;
    }
    else if(value < min) {
      angle = 0;
    }
    else {
      angle = (int)(180 * (value - min)/(max - min));
    }

    // Draw line representing the needle
    double radians = angle * Math.PI/180;
    int x = (int)(centerx - radius * 0.9 * Math.cos(radians));
    int y = (int)(centery - radius * 0.9 * Math.sin(radians));
    bufferg.setColor(Color.blue);
    bufferg.drawLine(centerx, centery, x, y);

    // Copy background buffer to screen
    g.drawImage(buffer, 0, 0, null);
  }
}
