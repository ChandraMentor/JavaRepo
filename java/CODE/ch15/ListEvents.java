import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
  <applet code="ListEvents" width=400 height=200>
  </applet>
*/

public class ListEvents extends Applet 
implements ActionListener, ItemListener {
  TextArea ta;

  public void init() {
    List list = new List();
    list.add("Hydrogen");
    list.add("Helium");
    list.add("Carbon");
    list.add("Oxygen");
    list.add("Potassium");
    list.add("Phosphorus");
    list.addActionListener(this);
    list.addItemListener(this);
    add(list);
    ta = new TextArea(10, 20);
    add(ta);
  }
  
  public void actionPerformed(ActionEvent ae) {
    ta.append("ActionEvent: " + 
      ae.getActionCommand() + "\n");
  }

  public void itemStateChanged(ItemEvent ie) {
    List list = (List)ie.getItemSelectable();
    ta.append("ItemEvent: " + 
      list.getSelectedItem() + "\n");
  }
}