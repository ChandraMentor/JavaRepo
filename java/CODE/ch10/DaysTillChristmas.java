import java.util.*;

class DaysTillChristmas {

  public static void main(String args[]) {

     // Get calendar for today's date
 GregorianCalendar today = new GregorianCalendar();

     // Get today's month
  int todayMonth = today.get(Calendar.MONTH);
  // Get today's day-of-month
  int todayDayOfMonth = today.get(Calendar.DAY_OF_MONTH);
  // Get today's year
  int todayYear = today.get(Calendar.YEAR);
   // Get today's day-of-year
 int todayDayOfYear = today.get(Calendar.DAY_OF_YEAR);
  // Calculate the number of day till Christmas
 int numDays;
if(todayMonth == 11 && todayDayOfMonth > 25) {
 GregorianCalendar xmas = new GregorianCalendar(todayYear + 1, 11, 
         25);
int xmasDayOfYear = xmas.get(Calendar.DAY_OF_YEAR);
numDays = xmasDayOfYear + 31 - todayDayOfMonth;
     }
     else {
       GregorianCalendar xmas = new GregorianCalendar(todayYear, 11, 25);
       int xmasDayOfYear = xmas.get(Calendar.DAY_OF_YEAR);
       numDays = xmasDayOfYear - todayDayOfYear;
     }

     // Display the number of days till Christmas
     System.out.println("The number of days till Christmas is " + 
       numDays);
  }
}