abstract class Monster {

  public String toString() {
    return getClass().getName();
  }
}

class Vampire extends Monster {
}

class Werewolf extends Monster {
}

class Zombie extends Monster {
}

class MonsterTypes {
  static int NUMMONSTERS = 6;

  public static void main(String args[]) {

    // Declare and allocate space for the monsters
    Monster monsters[] = new Monster[NUMMONSTERS];

    // Create monsters 
    monsters[0] = new Zombie();
    monsters[1] = new Vampire();
    monsters[2] = new Werewolf();
    monsters[3] = new Zombie();
    monsters[4] = new Werewolf();
    monsters[5] = new Vampire();

    // Display monsters
    for(int i = 0; i < NUMMONSTERS; i++) 
      System.out.println(monsters[i]);
  }
}