class LinearEquation {
static double solve(double a, double b) {
return -b/a;
  }
}
class StaticMethod {
public static void main(String args[]) {
 System.out.println(LinearEquation.solve(2, 2));
  }
}