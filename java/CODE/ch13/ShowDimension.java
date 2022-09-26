import java.applet.*;
import java.awt.*;
/*
  <applet code="ShowDimension" width=200 height=200>
  </applet>
*/

public class ShowDimension extends Applet {

  public void paint(Graphics g) {

    // Obtain dimension
    Dimension d = getSize();

    // Display on status line
    showStatus("width = " + d.width + "; height = " + d.height);
  }
}
