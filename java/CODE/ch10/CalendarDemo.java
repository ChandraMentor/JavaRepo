import java.util.*;

class CalendarDemo {
public static void main(String args[]) {
Calendar calendar = Calendar.getInstance();
System.out.println(calendar.get(Calendar.YEAR));
System.out.println(calendar.get(Calendar.HOUR));
System.out.println(calendar.get(
Calendar.HOUR_OF_DAY));
System.out.println(calendar.get(Calendar.MINUTE));
  }
}