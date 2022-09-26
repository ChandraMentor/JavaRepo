import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="CheckboxEvents" width=400 height=60>
  </applet>
*/

public class CheckboxEvents extends Applet 
implements ItemListener {
  Label label;

  public void init() {
    Checkbox cb1 = new Checkbox("Apple");
    cb1.addItemListener(this);
    add(cb1);
    Checkbox cb2 = new Checkbox("Banana");
    cb2.addItemListener(this);
    add(cb2);
    Checkbox cb3 = new Checkbox("Orange");
    cb3.addItemListener(this);
    add(cb3);
    label = new Label("                  ");
    add(label);
  }
  
  public void itemStateChanged(ItemEvent ie) {
    Checkbox cb = (Checkbox)ie.getItemSelectable();
    label.setText(cb.getLabel() + " " + cb.getState());
  }
}