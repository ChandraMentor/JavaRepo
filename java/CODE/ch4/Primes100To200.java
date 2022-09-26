class Primes100To200 {
  public static void main(String args[]) {
    for(int number = 101; number < 200; number++) {
      // Test for factors
      boolean prime = true;
      for(int i = 2; i <= number/2; i++)
        if((number % i) == 0) prime = false;
      // Display if prime
      if(prime == true) {
        System.out.print(number + " ");
      }
    };
  }
}