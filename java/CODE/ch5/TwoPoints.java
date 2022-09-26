class Point3D {
  double x;
  double y;
  double z;

  Point3D(double x) {
    this(x, 0, 0);
  }

  Point3D(double x, double y) {
    this(x, y, 0);
  }

  Point3D(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  // An instance method.
  void move(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
}

class TwoPoints {

  public static void main(String args[]) {

    Point3D p = new Point3D(1.1, 3.4, -2.8);
    Point3D p2 = new Point3D(9.6, 8.8, 100.2);
    System.out.println("p.x = " + p.x);
    System.out.println("p.y = " + p.y);
    System.out.println("p.z = " + p.z);
    System.out.println("p2.x = " + p2.x);
    System.out.println("p2.y = " + p2.y);
    System.out.println("p2.z = " + p2.z);
    p.move(5, 5, 5);
    System.out.println("p.x = " + p.x);
    System.out.println("p.y = " + p.y);
    System.out.println("p.z = " + p.z);
    System.out.println("p2.x = " + p2.x);
    System.out.println("p2.y = " + p2.y);
    System.out.println("p2.z = " + p2.z);
  }
}
