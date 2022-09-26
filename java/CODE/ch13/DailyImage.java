import java.applet.*;
import java.awt.*;
import java.util.*;

/*
  <applet code="DailyImage" width=280 height=280>
  <param name="day1" value="sun.jpg">
  <param name="day2" value="mon.jpg">
  <param name="day3" value="tue.jpg">
  <param name="day4" value="wed.jpg">
  <param name="day5" value="thu.jpg">
  <param name="day6" value="fri.jpg">
  <param name="day7" value="sat.jpg">
  </applet>
*/
public class DailyImage extends Applet {
Image image;
public void init() {
 // Determine the current day of the week
Calendar calendar = Calendar.getInstance();
int dow = calendar.get(Calendar.DAY_OF_WEEK);
// Get an image object
image = getImage(getDocumentBase(),
      getParameter("day" + dow));
  }
public void paint(Graphics g) {
g.drawImage(image, 0, 0, this);
  }
}