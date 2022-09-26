class Point3D {
  double x;
  double y;
  double z;
}

class Point3DExample {
  public static void main(String args[]) {
    Point3D p = new Point3D();
    p.x = 1.1;
    p.y = 3.4;
    p.z = -2.8;
    System.out.println("p.x = " + p.x);
    System.out.println("p.y = " + p.y);
    System.out.println("p.z = " + p.z);
  }
}
  