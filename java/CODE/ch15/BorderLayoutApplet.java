import java.applet.*;
import java.awt.*;
/*
  <applet code="BorderLayoutApplet" width=300 height=300>
  </applet>
*/

public class BorderLayoutApplet extends Applet {

  public void init() {
    setLayout(new BorderLayout(5, 5));
    Button b1 = new Button("North");
    Button b2 = new Button("South");
    Button b3 = new Button("East");
    Button b4 = new Button("West");
    Button b5 = new Button("Center");
    add(b1, "North");
    add(b2, "South");
    add(b3, "East");
    add(b4, "West");
    add(b5, "Center");
  }
}
