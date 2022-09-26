import java.lang.Double;
import static java.lang.Math.*;

class AreaCircumference {
public static void main(String args[]) {

double radius=Double.parseDouble(args[0]);
double area=PI*radius*radius;
double circumference = 2*PI*radius;

System.out.println("Radius is " + radius);
System.out.println("Area is " + area);
System.out.println("Circumference is " + 
circumference);
    }
}