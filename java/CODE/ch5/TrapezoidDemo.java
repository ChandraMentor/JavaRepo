class Trapezoid {
  double height, base1, base2;

  public Trapezoid(double height, double base1, double base2) {
    this.height = height;
    this.base1 = base1;
    this.base2 = base2;
  }

  public double getArea() {
    return 0.5 * height * (base1 + base2);
  }
}

class TrapezoidDemo {

  public static void main(String args[]) {

    Trapezoid trapezoid = new Trapezoid(6, 5, 8);
    System.out.println(trapezoid.getArea());
  }
}