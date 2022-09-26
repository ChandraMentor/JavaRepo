 class Circle {
  double x;
  double y;
  double radius;
//constructor overloading
Circle(double radius) {
this.radius = radius;
 }
Circle(double x, double y, double radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
}
//method overloading
void move(double x) {
this.x = x;
}
void move(double x, double y) {
  this.x = x;
  this.y = y;
}
void scale(double a) {
radius = radius * a;
 }
}
class CircleOverloadMethod {
public static void main(String args[]) {
Circle c = new Circle(4);
c.move(2);
c.scale(0.5);
System.out.println("c.x = " + c.x);
System.out.println("c.y = " + c.y);
System.out.println("c.radius = " + c.radius);
c.move(-2,-2);
c.scale(2);
System.out.println("c.x =" + c.x);
System.out.println("c.y =" + c.y);
System.out.println("c.radius=" + c.radius);
  }
}