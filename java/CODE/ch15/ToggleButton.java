import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="ToggleButton" width=200 height=60>
  </applet>
*/

public class ToggleButton extends Applet 
implements ActionListener {
  Button b;

  public void init() {
    b = new Button("Start");
    b.addActionListener(this);
    add(b);
  }
  
  public void actionPerformed(ActionEvent ae) {
    if(b.getLabel().equals("Start"))
      b.setLabel("Stop");
    else
      b.setLabel("Start");
  }
}