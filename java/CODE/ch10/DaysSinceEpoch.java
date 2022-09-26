import java.util.*;

class DaysSinceEpoch {

  public static void main(String args[]) {

    // Get date object initialized 
    // to current date and time
    Date currentDate = new Date();

    // Get msec since epoch
    long msec = currentDate.getTime();
    
    // Calculate the equivalent number of days
    long days = msec/(24 * 60 * 60 * 1000);

    // Display the equivalent number of days
    System.out.println(days);
  }
}
