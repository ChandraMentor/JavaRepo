import java.lang.*;

class PrimeNumbers {
public static void main(String args[]) {

int count = 0;
int number = 1;

do {
 // Test for factors
boolean prime = true;
for(int i=2;i<=number/2;i++)
if((number%i)==0)prime = false;
      // Display if prime
if(prime == true) {
System.out.print(number + " ");
++count;
      }
      // Increment number
      ++number;
    } while(count < 50);
  }
}