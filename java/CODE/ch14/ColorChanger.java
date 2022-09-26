import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="ColorChanger" width=120 height=120>
  </applet>
*/
public class ColorChanger extends Applet 
implements MouseListener, Runnable {

 boolean down;
  public void init() {
    Thread thread = new Thread(this);
    thread.start();
    addMouseListener(this);
  }
  public void mouseClicked(MouseEvent me) {
  }
  public void mouseEntered(MouseEvent me) {
  }
  public void mouseExited(MouseEvent me) {
  }
  public void mousePressed(MouseEvent me) {
    down = true;
  }
  public void mouseReleased(MouseEvent me) {
    down = false;
  }
  public void update(Graphics g) {
    paint(g);
  }

  public void run() {
    try {
      int angle = 0;
      while(true) {
        Thread.sleep(200);
        if(!down) {
     double radians = angle * Math.PI / 180;
     int r = (int)(127 * Math.sin(radians) + 127);
     int g = (int)(127 * Math.sin(2 * radians) + 127);
     int b = (int)(127 * Math.sin(3 * radians) + 127);

	  Color color = new Color(r, g, b);
      setBackground(color);
      repaint();
      ++angle;
          if(angle > 360)
            angle = 0;
        }
      }
    }
    catch(Exception e) {
    }
  }
}