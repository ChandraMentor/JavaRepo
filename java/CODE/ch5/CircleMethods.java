class Circle {
  double x;
  double y;
  double radius;

//constructor
Circle(double radius) {
this.radius = radius;
  }
Circle(double x, double y, double radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }
//instance method
void move(double x, double y) {
    this.x = x;
    this.y = y;
  }
void scale(double a) {
 radius *= a;
 System.out.println("Radius is" + radius);
  }
}
class CircleMethods {
public static void main(String args[]) {
Circle c = new Circle(4);
c.move(2, 2);
c.scale(0.5);

//second constructor
Circle c1 = new Circle(3,4,5);
c1.move(3,3);
c1.scale(0.75);

  }
}  