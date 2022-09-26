class Thing {
static int count;
  String name;

  Thing(String name) {
    this.name = name;
    ++count;
  }
}

class StaticVariable {

  public static void main(String args[]) {

    Thing t1 = new Thing("Bowling Ball");
    System.out.println(t1.name + " " + t1.count);
    Thing t2 = new Thing("Ping Pong Ball");
    System.out.println(t2.name + " " + t2.count);
    Thing t3 = new Thing("Football");
     System.out.println(t3.name + " " + t3.count);
  }
}