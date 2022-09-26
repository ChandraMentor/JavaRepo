class Point3D {
  double x;
  double y;
  double z;

 Point3D(double ax) {
    x = ax;
    y = 1;
    z = 1;
  }
  Point3D(double ax, double ay) {
    x = ax;
    y = ay;
    z = 1;
  }

 Point3D(double ax, double ay, double az) {
    x = ax;
    y = ay;
    z = az;
  }
}

class Point3DOverloadConstructors {

  public static void main(String args[]) {

    Point3D p1 = new Point3D(1.1);
    System.out.println("p1.x = " + p1.x);
    System.out.println("p1.y = " + p1.y);
    System.out.println("p1.z = " + p1.z);
    Point3D p2 = new Point3D(1.1, 3.4);
    System.out.println("p2.x = " + p2.x);
    System.out.println("p2.y = " + p2.y);
    System.out.println("p2.z = " + p2.z);
    Point3D p3 = new Point3D(1.1, 3.4, -2.8);
    System.out.println("p3.x = " + p3.x);
    System.out.println("p3.y = " + p3.y);
    System.out.println("p3.z = " + p3.z);
  }
}