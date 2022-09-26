import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
  <applet code="AddColors" width=400 height=60>
  </applet>
*/

public class AddColors extends Applet 
implements ItemListener {

  Checkbox red, green, blue;
  Canvas canvas;

  public void init() {
    red = new Checkbox("Red");
    red.addItemListener(this);
    add(red);
    green = new Checkbox("Green");
    green.addItemListener(this);
    add(green);
    blue = new Checkbox("Blue");
    blue.addItemListener(this);
    add(blue);

    canvas = new Canvas();
    canvas.setBackground(Color.black);
    canvas.setSize(300, 300);
    add(canvas);
  }
  
  public void itemStateChanged(ItemEvent ie) {
    int rgb = 0;
    if(red.getState())
      rgb = 0xff0000;
    if(green.getState())
      rgb |= 0x00ff00;
    if(blue.getState())
      rgb |= 0x0000ff;
    Color color = new Color(rgb);
    canvas.setBackground(color);
    canvas.repaint();
  }
}