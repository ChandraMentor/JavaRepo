import java.applet.*;
import java.awt.*;
import java.util.*;
/*
  <applet code="GaussianDots" width=300 height=300>
  </applet>
*/
  
public class GaussianDots extends Applet 
implements Runnable {
  int x, y;

  public void init() {
    x = y = -1;
    Thread thread = new Thread(this);
    thread.start();
  }

  public void run() {
    Random random = new Random();
    try {
      while(true) {
        Dimension d = getSize();
        Thread.sleep(100);
        x = (int)(d.width/2 + d.width * random.nextGaussian()/8);
        y = (int)(d.height/2 + d.height * random.nextGaussian()/8);
        repaint();
      }
    }
    catch(Exception e) {
    }
  }

  public void update(Graphics g) {
    paint(g);
  }

  public void paint(Graphics g) {
    g.fillRect(x, y, 1, 1);
  }
}