class SquaresCubes {
  public static void main(String args[]) {
    for(int i = 1; i < 11; i++) {
      int square = i * i;
      int cube = square * i;
      System.out.println(i + " " + square + " " + cube);
    }
  }
}