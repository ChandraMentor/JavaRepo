import java.util.*;

class MonthCalendar {
  static String dayNames[] = { "Sun", "Mon", 
    "Tue", "Wed", "Thu", "Fri", "Sat" };
  static String monthNames[] = { "January", 
    "February", "March", "April", "May",
    "June", "July", "August", "September", 
    "October", "November", "December" };
  static int daysInMonths[] = { 31, 28, 31, 30, 31, 30, 
      31, 31, 30, 31, 30, 31 };

  public static void main(String args[]) {

    // Get year, month, date, and day-of-week 
    GregorianCalendar gc = new GregorianCalendar();
    int year = gc.get(Calendar.YEAR);
    int month = gc.get(Calendar.MONTH);
    int date = gc.get(Calendar.DATE);
    int dow = gc.get(Calendar.DAY_OF_WEEK);

    // Handle leap years
    daysInMonths[1] += 
      gc.isLeapYear(year) ? 1 : 0;

    // Change to the first day of the month
    gc.add(Calendar.DATE, -date + 1);

    // Determine the day of week
    int fdow = gc.get(Calendar.DAY_OF_WEEK);

    // Compute the variable dom
    // (If necessary, this will be a negative value)
    int dom = 2 - fdow;

    // Display month and year
    System.out.println(monthNames[month] + " " + year + "\n");

    // Display column headings
    for(int i = 0; i < 7; i++) {
      String s = dayNames[i];
      System.out.print(s + " ");
    }
    System.out.println("");

    // Display dates
    for(int row = 0; row < 6; row++) {
      for(int col = 0; col < 7; col++) {
        if(dom > daysInMonths[month]) {
          break;
        }
        if(dom > 0) {
          // Display date in the grid cell
          if(dom < 10)
            System.out.print("  " + dom + " ");
          else
            System.out.print(" " + dom + " ");
        }
        else {
          System.out.print("    ");
        }
        ++dom;
      }
      System.out.println("");
    }
  }
}
