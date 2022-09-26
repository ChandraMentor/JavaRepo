import java.util.*;

class Add100Days {

  public static void main(String args[]) {

    // Get date object initialized 
    // to current date and time
    Date date = new Date();

    // Get number of msec since epoch
    long msec = date.getTime();

    // Add 100 days to msec
    msec += 100 * 24 * 60 * 60 * 1000L;

    // Update time
    date.setTime(msec);

    // Display future date information
    System.out.println(date);
  }
}
