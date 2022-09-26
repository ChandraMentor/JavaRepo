import java.applet.*;
import java.awt.*;
/*
  <applet code="Labels" width=200 height=120>
  </applet>
*/

public class Labels extends Applet {

  public void init() {
    String s = "This is a very long label";
    Label l1 = new Label(s, Label.LEFT);
    add(l1);
    Label l2 = new Label(s, Label.CENTER);
    add(l2);
    Label l3 = new Label(s, Label.RIGHT);
    add(l3);
  }
}