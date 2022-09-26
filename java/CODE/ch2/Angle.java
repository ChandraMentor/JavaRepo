import java.lang.*;
class Angle {
public static void main(String args[]) {
// Get angle in degrees
double degrees = Double.parseDouble(args[0]);
// Convert to radians
double radians = degrees * Math.PI/180;
// Display trig values
System.out.println("cos=" + Math.cos(radians));
System.out.println("sin=" + Math.sin(radians));
System.out.println("tan=" + Math.tan(radians));
System.out.println("Square Root is" + Math.sqrt(3));
  }
}