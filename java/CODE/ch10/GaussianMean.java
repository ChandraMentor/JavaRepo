import java.util.*;

class GaussianMean {

  public static void main(String args[]) {
  
    // Determine number of random numbers
    int count = 100;
    if(args.length > 0) {
      count = Integer.parseInt(args[0]);
    }

    // Generate random numbers
    Random generator = new Random();
    double total = 0;
    for(int i = 0; i < count; i++) {
      total += generator.nextGaussian();
    }

    // Display the mean of these numbers
    System.out.println("Mean = " + total/count);
  }
}