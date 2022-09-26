import java.applet.Applet;
import java.awt.*;
/*
  <applet code="ColorBars" width=260 height=260>
  </applet>
*/

public class ColorBars extends Applet {
  Color colors[] = { Color.black, Color.blue, Color.cyan,
    Color.darkGray, Color.gray, Color.green, Color.lightGray,
    Color.magenta, Color.orange, Color.pink, Color.red,
    Color.white, Color.yellow };
  
  public void paint(Graphics g) {
    int deltax = 260/colors.length;
    for(int i = 0; i < colors.length; i++) {
      g.setColor(colors[i]);
      g.fillRect(i * deltax, 0, (i + 1) * deltax, 260);
    }
  }
}