import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="Brighter" width=300 height=300>
  </applet>
*/

public class Brighter extends Applet 
implements MouseListener {
  int i;
  Color color;

  public void init() {
    color = new Color(i, i, i);
    setBackground(color);
    addMouseListener(this);
  }
  
  public void mouseClicked(MouseEvent me) {
    i += 10;
    if(i > 255)
      i = 255;
    color = new Color(i, i, i);
    setBackground(color);
    repaint();
  }

  public void mouseEntered(MouseEvent me) {
  }

  public void mouseExited(MouseEvent me) {
  }
  
  public void mousePressed(MouseEvent me) {
  }

  public void mouseReleased(MouseEvent me) {
  }
}