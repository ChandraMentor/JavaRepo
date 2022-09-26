import java.text.DateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;

public class Test {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
    if (calendar.isWeekDateSupported()) {
      System.out.println("Number of weeks in this year: "
          + calendar.getWeeksInWeekYear());
      System.out.println("Current week number: "
          + calendar.get(Calendar.WEEK_OF_YEAR));
    }

    calendar.setWeekDate(2012, 16, 3);
    System.out.println(DateFormat.getDateTimeInstance(DateFormat.LONG,
        DateFormat.LONG).format(calendar.getTime()));

  }
}
