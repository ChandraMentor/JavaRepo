import java.applet.*;
import java.awt.*;
import java.util.*;
/*
  <applet code="ShowDate" width=200 height=200>
  </applet>
*/
public class ShowDate extends Applet {
 String[] monthNames = {
    "January", "February", "March",
    "April", "May", "June",
    "July", "August", "September",
    "October", "November", "December" };

  public void paint(Graphics g) {
    // Obtain date information
    Calendar calendar = Calendar.getInstance();
    int month = calendar.get(Calendar.MONTH);
    int date = calendar.get(Calendar.DATE);
    int year = calendar.get(Calendar.YEAR);

    // Create string with date information
    String str = monthNames[month] + " " + date + " " + year;

    // Display in center of applet
    Font font = getFont();
    FontMetrics fm = getFontMetrics(font);
    Dimension d = getSize();
    int x = (d.width - fm.stringWidth(str))/2;
    int y = d.height/2;
    g.drawString(str, x, y);

    // Display on status line
    showStatus(str);
  }
}
