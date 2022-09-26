import java.applet.*;
import java.awt.*;
import java.net.*;
/*
  <applet code="ShowDocument" width=200 height=50>
  </applet>
*/

public class ShowDocument extends Applet {

  public void paint(Graphics g) {
    AppletContext ac = getAppletContext();
    try {
      URL url = new URL("http://www.gmail.com");
      ac.showDocument(url, "frame2");
    }
    catch(Exception e) {
      showStatus("Exception: " + e);
    }
    g.drawString("ShowDocument Applet",10,25);
  }
}
