import static java.lang.Math.*;
import static java.lang.Double.*;

class Circle {
public static void main(String args[]) {
// Get radius
double radius = parseDouble(args[0]);
//Display Area
double area = PI*radius*radius;
System.out.print("Area is" + area);
  }
}