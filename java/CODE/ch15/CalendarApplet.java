import java.applet.*;
import java.awt.*;
import java.util.*;
/*
  <applet code="CalendarApplet" width=500 height=250>
  </applet>
*/

public class CalendarApplet extends Applet {

  static String dayNames[] = { "Sun", "Mon", 
    "Tue", "Wed", "Thu", "Fri", "Sat" };
  static String monthNames[] = { "January", 
    "February", "March", "April", "May",
    "June", "July", "August", "September", 
    "October", "November", "December" };
  static int daysInMonths[] = { 31, 28, 31, 30, 31, 30, 
      31, 31, 30, 31, 30, 31 };

  public void init() {

    // Create a calendar initialized with the
    // current date/time
    GregorianCalendar gc = new GregorianCalendar();

    // Adjust the date of this calendar to the 1st
    // of the current month
    int date = gc.get(Calendar.DATE);
    gc.add(Calendar.DATE, -(date - 1));

    // Get year, month, and day-of-week components
    int year = gc.get(Calendar.YEAR);
    int month = gc.get(Calendar.MONTH);
    int dow = gc.get(Calendar.DAY_OF_WEEK);

    // Adjust for leap year
    daysInMonths[1] += gc.isLeapYear(year) ? 1 : 0;

    // Create GUI
    setLayout(new BorderLayout());
    String s = monthNames[month] + " " + year;
    Label calendarLabel = new Label(s, Label.CENTER);
    add(calendarLabel, "North");
    CalendarCanvas calendarCanvas = new CalendarCanvas(year, month, dow);
    add(calendarCanvas, "Center");
  }
}

class CalendarCanvas extends Canvas {
  int year, month, dow;

  public CalendarCanvas(int year, int month, int dow) {
    this.year = year;
    this.month = month;
    this.dow = dow;
  }
  
  public void paint(Graphics g) {

    // Draw rectangle around the canvas boundaries
    Dimension d = getSize();
    int h = d.height;
    int w = d.width;
    g.drawRect(0, 0, w - 1, h - 1);

    // Draw lines for the grid columns
    int c = w/7;
    for(int i = 1; i < 7; i++) {
      g.drawLine(i * c, 0, i * c, h);
    }

    // Draw lines for the grid rows
    int r = h/13;
    for(int i = 1; i <= 11; i = i + 2) {
      g.drawLine(0, i * r, w, i * r);
    }

    // Draw the names of the days on the grid
    for(int i = 0; i < 7; i++) {
      String s = CalendarApplet.dayNames[i];
      FontMetrics fm = g.getFontMetrics();
      int ascent = fm.getAscent();
      int width = fm.stringWidth(s);
      int x = i * c + (c - width)/2;
      int y = (r - ascent)/2 + ascent;
      g.drawString(s, x, y);
    }

    // Compute the variable dom (day-of-month)
    // (If necessary, this will be a negative value)
    int dom = (1 <= dow) ? 1 - dow + 1 :  1 - 8 + dow;

    // Draw numbers into the grid cells
    for(int row = 0; row < 6; row++) {
      for(int col = 0; col < 7; col++) {
        if(dom > CalendarApplet.daysInMonths[month]) {
          break;
        }
        if(dom > 0) {
          // Display date in the grid cell
          String s = "" + dom;
          FontMetrics fm = g.getFontMetrics();
          int ascent = fm.getAscent();
          int width = fm.stringWidth(s);
          int x = c * col + (c - width)/2;
          int y = 2 * r * row + 
            (2 * r - ascent)/2 + ascent + r;
          g.drawString(s, x, y);
        }
        ++dom;
      }
    }
  }
}