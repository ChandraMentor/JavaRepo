import java.applet.*;
import java.awt.*;
/*
  <applet code="DrawImage" width=280 height=280>
  <param name="file" value="kids2.jpg">
  </applet>
*/

public class DrawImage extends Applet {
  Image image;
 
  public void init() {
    image = getImage(getDocumentBase(), getParameter("file"));
  }
    
  public void paint(Graphics g) {
    g.drawImage(image, 0, 0, this);
  }
}