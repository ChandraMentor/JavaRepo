import java.applet.*;
import java.awt.*;
/*
  <applet code="NamePassword" width=500 height=60>
  </applet>
*/

public class NamePassword extends Applet {

  public void init() {
    Label l1 = new Label("Name: ", Label.RIGHT);
    add(l1);
    TextField tf1 = new TextField("chandra", 20);
    add(tf1);
    Label l2 = new Label("Password: ", Label.RIGHT);
    add(l2);
    TextField tf2 = new TextField("", 20);
    add(tf2);
    tf2.setEchoChar('*');
  }
}