import java.applet.*;
import java.awt.*;
/*
  <applet code="DrawRandomImage" width=280 height=280>
  <param name="count" value="8">
  <param name="file0" value="file0.jpg">
  <param name="file1" value="file1.jpg">
  <param name="file2" value="file2.jpg">
  <param name="file3" value="file3.jpg">
  <param name="file4" value="file4.jpg">
  <param name="file5" value="file5.jpg">
  <param name="file6" value="file6.jpg">
  <param name="file7" value="file7.jpg">
  </applet>
*/

public class DrawRandomImage extends Applet {
  Image image;
 
  public void init() {

    // Select a random image
    String str = getParameter("count");
    int count = Integer.parseInt(str);
    int n = (int)(count * Math.random());
    String filename = getParameter("file" + n);
    
    // Get image
    image = getImage(getDocumentBase(), 
      filename);
  }
    
  public void paint(Graphics g) {
    g.drawImage(image, 0, 0, this);
  }
}