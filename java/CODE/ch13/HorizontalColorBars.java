import java.applet.Applet;
import java.awt.*;
/*
  <applet code="HorizontalColorBars" width=200 height=200>
  </applet>
*/

public class HorizontalColorBars extends Applet {
  Color colors[] = { Color.black, Color.blue, Color.cyan,
    Color.darkGray, Color.gray, Color.green, Color.lightGray,
    Color.magenta, Color.orange, Color.pink, Color.red,
    Color.white, Color.yellow };
  
  public void paint(Graphics g) {
    int deltay = 200/colors.length;
    for(int i = 0; i < colors.length; i++) {
      g.setColor(colors[i]);
      g.fillRect(0, i * deltay, 200, (i + 1) * deltay);
    }
  }
}