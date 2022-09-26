class Rock {
  float mass;

  Rock(float mass) {
    this.mass = mass;
  }
}

class RockArray {
  static int NUMROCKS = 10;

  public static void main(String args[]) {

    // Create the rocks
    Rock rocks[] = new Rock[NUMROCKS];
    for(int i = 0; i < NUMROCKS; i++) {
      float mass = (float)(9 * Math.random() + 1);
      rocks[i] = new Rock(mass);
    }

    // Display the mass of each rock
    float total = 0f;
    for(int i = 0; i < NUMROCKS; i++) {
      float mass = rocks[i].mass;
      System.out.println(mass);
      total += mass;
    }

    // Display the total mass
    System.out.println("Total = " + total);
  }
}