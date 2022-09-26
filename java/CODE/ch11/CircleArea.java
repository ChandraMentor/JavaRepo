import java.io.*;

class CircleArea {
public static void main(String args[]) {
try {
 // Get a buffered reader for the standard input
InputStreamReader isr = 
new InputStreamReader(System.in);

BufferedReader br = new BufferedReader(isr);

while(true) {
// Prompt user for radius
System.out.print("Radius? ");
// Process user input
String str = br.readLine();
double radius;
try {
radius = Double.valueOf(str).doubleValue();
        }
catch(NumberFormatException nfe) {
        System.out.println("Incorrect format!");
          continue;
        }

        // Check that radius is > 0
        if(radius <= 0) {
          System.out.println("Radius must be positive!");
          continue;
        }

        // Display area and return
        double area = Math.PI * radius * radius;
        System.out.println("Area is " + area);
        return;
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}