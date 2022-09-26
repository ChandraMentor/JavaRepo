import java.util.*;

class DaysTillEndOfYear {

  public static void main(String args[]) {

    // Determine current day-of-year
    Calendar calendar1 = Calendar.getInstance();
    int doy1 = calendar1.get(Calendar.DAY_OF_YEAR);

    // Determine current year
    int year = calendar1.get(Calendar.YEAR);

    // Determine December 31 day-of-year
    Calendar calendar2 = new GregorianCalendar(year, 11, 31);
    int doy2 = calendar2.get(Calendar.DAY_OF_YEAR);

    // Compute days remaining in current year
    int days = doy2 - doy1;
    System.out.println(days + 
      " days remain in current year");
  }
}