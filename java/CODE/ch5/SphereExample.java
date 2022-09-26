class Sphere {
  double x;
  double y;
  double z;
  double radius;
}

class SphereExample {
public static void main(String args[]) {

Sphere s = new Sphere();
    s.x = 100;
    s.y = -40;
    s.z = 56.5;
    s.radius = 8;
 System.out.println("s.x = " + s.x);
 System.out.println("s.y = " + s.y);
  System.out.println("s.z = " + s.z);
    System.out.println("s.radius = " + s.radius);
  }
}
