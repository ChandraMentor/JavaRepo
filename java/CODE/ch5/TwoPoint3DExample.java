class Point3D {
  double x;
  double y;
  double z;
}

class TwoPoint3DExample {

  public static void main(String args[]) {

    Point3D p1 = new Point3D();
    Point3D p2 = new Point3D();

    // point p1
    p1.x = 1.1;
    p1.y = 3.4;
    p1.z = -2.8;

    // point p2
    p2.x = 100.1;
    p2.y = 103.4;
    p2.z = -202.8;

    System.out.println("p1.x = " + p1.x);
    System.out.println("p1.y = " + p1.y);
    System.out.println("p1.z = " + p1.z);
    System.out.println("p2.x = " + p2.x);
    System.out.println("p2.y = " + p2.y);
    System.out.println("p2.z = " + p2.z);

  }
}
