class NegativeArgumentExceptionDemo {

  public static void main(String args[]) 
  throws NegativeArgumentException {

    for(int i = 0; i < args.length; i++) {
      double d = Double.valueOf(args[i]).doubleValue();
      if(d < 0) {
        String str = "Negative command line argument: ";
        str += d;
        throw new NegativeArgumentException(str);
      }
    }
  }
}

class NegativeArgumentException extends Exception {
  public NegativeArgumentException(String message) {
    super(message);
  }
}