import java.applet.*;
import java.awt.*;
/*
  <applet code="FlowLayoutApplet" width=300 height=200>
  </applet>
*/

public class FlowLayoutApplet extends Applet {

  public void init() {
    setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
    for(int i = 0; i < 20; i++) {
      add(new Button("Button" + i));
    }
  }
}
