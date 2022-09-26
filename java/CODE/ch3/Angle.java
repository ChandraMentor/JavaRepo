class Angle {
  public static void main(String args[]) {
    if(args.length > 0) {
      double angle = Double.valueOf(args[0]).doubleValue();
      double radians = angle * Math.PI/180;
      System.out.println("cosine: " + Math.cos(radians));
      System.out.println("sine: " + Math.sin(radians));
      System.out.println("tangent: " + Math.tan(radians));
    }
    else {
      System.out.println("Provide an angle in degrees " +
        "as command line argument");
    }
  }
}