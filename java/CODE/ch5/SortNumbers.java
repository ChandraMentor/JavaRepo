class SortNumbers {

  public static void main(String args[]) {

    // Declare, allocate, and initialize array
    int size = args.length;
    double data[] = new double[size];
    for(int i = 0; i < size; i++) 
      data[i] = Double.valueOf(args[i]).doubleValue();

    // Sort the array
    for(int i = 0; i < size - 1; i++) {
      for(int j = i; j < size; j++) {
        if(data[j] > data[i]) {
          double temp = data[j];
          data[j] = data[i];
          data[i] = temp;
        }
      }
    }

    // Display the array in ascending order
    for(int i = 0; i < size; i++)
      System.out.print(data[i] + " ");
  }
}
    
      