import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="SelectColor" width=400 height=60>
  </applet>
*/

public class SelectColor extends Applet 
implements ItemListener {
  CheckboxGroup cbg;
  Checkbox red, green, blue;
  Canvas canvas;

  public void init() {
    cbg = new CheckboxGroup();
    red = new Checkbox("Red", cbg, true);
    red.addItemListener(this);
    add(red);
    green = new Checkbox("Green", cbg, false);
    green.addItemListener(this);
    add(green);
    blue = new Checkbox("Blue", cbg, false);
    blue.addItemListener(this);
    add(blue);
    canvas = new Canvas();
    canvas.setBackground(Color.red);
    canvas.setSize(30, 30);
    add(canvas);
  }
  
  public void itemStateChanged(ItemEvent ie) {
    Color color;
    Checkbox cb = cbg.getSelectedCheckbox();
    if(cb == red)
      color = Color.red;
    else if(cb == green)
      color = Color.green;
    else
      color = Color.blue;
    canvas.setBackground(color);
    canvas.repaint();
  }
}