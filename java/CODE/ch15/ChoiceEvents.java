import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="ChoiceEvents" width=400 height=60>
  </applet>
*/

public class ChoiceEvents extends Applet 
implements ItemListener {
  Label label;

  public void init() {
    Choice c1 = new Choice();
    c1.addItem("Red");
    c1.addItem("Orange");
    c1.addItem("Yellow");
    c1.addItem("Green");
    c1.addItem("Blue");
    c1.addItem("Indigo");
    c1.addItem("Violet");
    c1.addItemListener(this);
    add(c1);
    Choice c2 = new Choice();
    c2.addItem("North");
    c2.addItem("South");
    c2.addItem("East");
    c2.addItem("West");
    c2.addItemListener(this);
    add(c2);
    label = new Label("                  ");
    add(label);
  }
  
  public void itemStateChanged(ItemEvent ie) {
    Choice c = (Choice)ie.getItemSelectable();
    label.setText(c.getSelectedItem());
  }
}