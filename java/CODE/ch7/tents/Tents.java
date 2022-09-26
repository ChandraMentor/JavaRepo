package tents;

abstract class Tent {
}

class TentA extends Tent {
}

class TentB extends Tent
implements Waterproof {
}

class TentC extends Tent {
}

class TentD extends Tent
implements Waterproof {
}

interface Waterproof {
}

class Tents {

  public static void main(String args[]) {

    Tent tents[] = new Tent[4];
    tents[0] = new TentA();
    tents[1] = new TentB();
    tents[2] = new TentC();
    tents[3] = new TentD();

    for(int i = 0; i < 4; i++) {
      if(tents[i] instanceof Waterproof) {
        Class cls = tents[i].getClass();
        System.out.println(cls.getName());
      }
    }
  }
}