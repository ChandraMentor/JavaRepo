class Point3D {
  double x;  double y;  double z;

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
  void move(double x) {
  this.x = x;
  }

  void move(double x, double y) {
    this.x = x;
    this.y = y;
  }

  void move(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
}

class Point3DOverloadMethods {

  public static void main(String args[]) {

    Point3D p = new Point3D(1.1, 3.4, -2.8);
    p.move(5);
    System.out.println("p.x = " + p.x);
    System.out.println("p.y = " + p.y);
    System.out.println("p.z = " + p.z);
    p.move(6, 6);
    System.out.println("p.x = " + p.x);
    System.out.println("p.y = " + p.y);
    System.out.println("p.z = " + p.z);
    p.move(7, 7, 7);
    System.out.println("p.x = " + p.x);
    System.out.println("p.y = " + p.y);
    System.out.println("p.z = " + p.z);
  }
}  