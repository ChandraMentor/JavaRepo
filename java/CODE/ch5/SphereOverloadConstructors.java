class Sphere {
  double x;
  double y;
  double z;
  double radius;

  Sphere() {
    radius = 1;
  }

  Sphere(double aradius) {
    radius = aradius;
  }

  Sphere(double ax, double ay, double az, double aradius) {
    x = ax;
    y = ay;
    z = az;
    radius = aradius;
  }
}

class SphereOverloadConstructors {

public static void main(String args[]) {
    Sphere s1 = new Sphere();
    System.out.println("s1.x = " + s1.x);
    System.out.println("s1.y = " + s1.y);
    System.out.println("s1.z = " + s1.z);
    System.out.println("s1.radius = " + s1.radius);

	Sphere s2 = new Sphere(2);
    System.out.println("s2.x = " + s2.x);
    System.out.println("s2.y = " + s2.y);
    System.out.println("s2.z = " + s2.z);
    System.out.println("s2.radius = " + s2.radius);

	Sphere s3 = new Sphere(100, -40, 56.5, 8);
    System.out.println("s3.x = " + s3.x);
    System.out.println("s3.y = " + s3.y);
    System.out.println("s3.z = " + s3.z);
    System.out.println("s3.radius = " + s3.radius);
  }
}