class PrimeTest {

  public static void main(String args[]) {

    // Convert command line argument
    int num = Integer.parseInt(args[0]);

    // Test for factors 
    boolean prime = true;
    for(int i = 2; i <= num/2; i = i + 1)
      if((num % i) == 0) prime = false;

    // Display results
    if(prime == true) 
      System.out.print("The number is prime.");
    else 
      System.out.print("The number is not prime.");
  }
}
    