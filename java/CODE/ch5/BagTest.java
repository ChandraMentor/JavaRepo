class Bag {
  boolean flag;
  int i, j = 2, k = 3, l, m;
  double array[] = { -3.4, 8.8e100, -9.2e-100 };
  String s1, s2 = new String("Hello");
}

class BagTest {
  public static void main(String args[]) {
    Bag bag = new Bag();
    System.out.println(bag.flag);
    System.out.println(bag.i);
    System.out.println(bag.j);
    System.out.println(bag.k);
    System.out.println(bag.l);
    System.out.println(bag.m);
    for(int i = 0; i < bag.array.length; i++) 
      System.out.println(bag.array[i]);
    System.out.println(bag.s1);
    System.out.println(bag.s2);
  }
}

    








/*
class Junk {
  public static void main(String args[]) {
    int i, j, k = 3, l = 5;
    System.out.println(i);
    System.out.println(j);
    System.out.println(k);
    System.out.println(l);
  }
}
*/

