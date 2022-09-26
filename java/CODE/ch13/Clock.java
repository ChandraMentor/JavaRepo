import java.applet.*;
import java.awt.*;
import java.util.*;
/*
  <applet code="Clock" width=200 height=200>
  </applet>
*/

public class Clock extends Applet 
implements Runnable {
  Thread t;

  public void init() {
    t = new Thread(this);
    t.start();
  }

  public void run() {
    try {
      while(true) {
        Thread.sleep(60000);
        repaint();
      }
    }
    catch(Exception e) {
    }
  }

  public void paint(Graphics g) {

    // Draw circle
    Dimension d = getSize();
    int xc = d.width/2;
    int yc = d.height/2;
    int radius = (int)((d.width < d.height) ? 
      0.4 * d.width : 0.4 * d.height);
    g.drawOval(xc - radius, yc - radius, 2 * radius, 2 * radius);

    // Draw marks for hours along circle perimeter
    for(int i = 0; i < 12; i++) {
      double degrees = i * 30;
      double radians = degrees * Math.PI/180;
      int xa = xc + (int)(0.9 * radius * Math.cos(radians));
      int ya = yc - (int)(0.9 * radius * Math.sin(radians));
      int xb = xc + (int)(radius * Math.cos(radians));
      int yb = yc - (int)(radius * Math.sin(radians));
      g.drawLine(xa, ya, xb, yb);
    }

    // Get calendar initialized to current date/time
    Calendar calendar = Calendar.getInstance();

    // Draw minute hand
    int minute = calendar.get(Calendar.MINUTE);
    double degrees = 90 - 6 * minute;
    double radians = degrees * Math.PI/180;
    int xh = xc + (int)(0.8 * radius * Math.cos(radians));
    int yh = yc - (int)(0.8 * radius * Math.sin(radians));
    g.drawLine(xc, yc, xh, yh);

    // Draw hour hand
    int hour = calendar.get(Calendar.HOUR_OF_DAY) % 24;
    degrees = 90 - 30 * hour - 30 * (minute/60.0f);
    radians = degrees * Math.PI/180;
    int xm = xc + (int)(0.5 * radius * Math.cos(radians));
    int ym = yc - (int)(0.5 * radius * Math.sin(radians));
    g.drawLine(xc, yc, xm, ym);
  }
}