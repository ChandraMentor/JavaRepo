import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="ButtonEvents" width=400 height=60>
  </applet>
*/

public class ButtonEvents extends Applet 
implements ActionListener {
  Label label;

  public void init() {
    Button b1 = new Button("Apple");
    b1.addActionListener(this);
    add(b1);
    Button b2 = new Button("Banana");
    b2.addActionListener(this);
    add(b2);
    Button b3 = new Button("Orange");
    b3.addActionListener(this);
    add(b3);
    label = new Label("                  ");
    add(label);
  }
  
  public void actionPerformed(ActionEvent ae) {
    label.setText(ae.getActionCommand());
  }
}