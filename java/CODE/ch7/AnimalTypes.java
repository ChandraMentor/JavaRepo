class AnimalTypes {
  private final static int NUMANIMALS = 7;

  public static void main(String args[]) {

    // Declare and allocate space for an array
    Animal animals[] = new Animal[NUMANIMALS];

    // Initialize array entries
    animals[0] = new Dove();
    animals[1] = new Eagle();
    animals[2] = new Hawk();
    animals[3] = new Penguin();
    animals[4] = new Seagull();
    animals[5] = new Rattlesnake();
    animals[6] = new Turtle();

    // Display all cold blooded animals
    System.out.println("Cold blooded animals:");
    for(int i = 0; i < NUMANIMALS; i++) {
      if(animals[i] instanceof ColdBlooded) {
        System.out.println(animals[i]);
      }
    }

    // Display all ocean dwelling
    System.out.println("Ocean dwelling animals:");
    for(int i = 0; i < NUMANIMALS; i++) {
      if(animals[i] instanceof OceanDwelling) {
        System.out.println(animals[i]);
      }
    }
  }
}

interface ColdBlooded {
}

interface OceanDwelling {
}

abstract class Animal {
}

abstract class Bird extends Animal {
}

class Dove extends Bird {
  public String toString() {
    return "Dove";
  }
}

class Eagle extends Bird {
  public String toString() {
    return "Eagle";
  }
}

class Hawk extends Bird {
  public String toString() {
    return "Hawk";
  }
}

class Penguin extends Bird
implements OceanDwelling {
  public String toString() {
    return "Penguin";
  }
}

class Seagull extends Bird
implements OceanDwelling {
  public String toString() {
    return "Seagull";
  }
}

abstract class Reptile extends Animal 
implements ColdBlooded {
}

class Rattlesnake extends Reptile {
  public String toString() {
    return "Rattlesnake";
  }
}

class Turtle extends Reptile
implements OceanDwelling {
  public String toString() {
    return "Turtle";
  }
}