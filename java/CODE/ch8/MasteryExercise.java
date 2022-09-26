class MasteryExercise {

  public static void main(String args[]) {
    try {
      System.out.println("The sum is " + add(args));
    }
    catch(NumberFormatException e) {
      System.out.println(e);
    }
    catch(RangeException e) {
      System.out.println(e);
    }
    finally {
      System.out.println("Thanks for using this program");
    }
  }

  static double add(String args[]) 
  throws NumberFormatException, RangeException {
    double sum = 0;
    for(int i = 0; i < args.length; i++) {
      double d = Double.valueOf(args[i]).doubleValue();
      if(d < 0 || d > 1)
        throw new RangeException(d);
      sum += d;
    }
    return sum;
  }
}

class RangeException extends Exception {
  double d;

  public RangeException(double d) {
    this.d = d;
  }

  public String toString() {
    return "Argument " + d + " must be between 0 and 1";
  }
}

