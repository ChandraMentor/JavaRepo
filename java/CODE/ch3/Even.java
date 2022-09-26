import java.util.Scanner;

class Even{
public static void main(String[] args) {
 int i;
 i=0;
 
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the value of i");
 i=s.nextInt();
 if(i%2==0)
	 System.out.println("Even number");
 else
	 System.out.println("Odd Number");
	
}
}
