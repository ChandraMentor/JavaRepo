class RobotTypes {
  private final static int NUMROBOTS = 7;

  public static void main(String args[]) {

    // Declare and allocate space for an array
    Robot robots[] = new Robot[NUMROBOTS];

    // Initialize array entries
    robots[0] = new RobotA();
    robots[1] = new RobotA1();
    robots[2] = new RobotB();
    robots[3] = new RobotB1();
    robots[4] = new RobotB2();
    robots[5] = new RobotC();
    robots[6] = new RobotC1();

    // Exercise the 'beep' method on all robots
    // that implement the Sound interface
    for(int i = 0; i < NUMROBOTS; i++) {
      if(robots[i] instanceof Sound) {
        Sound sound = (Sound)robots[i];
        sound.beep();
      }
    }

    // Exercise the 'stop' method on all robots
    // that implement the Locomotion interface
    for(int i = 0; i < NUMROBOTS; i++) {
      if(robots[i] instanceof Locomotion) {
        Locomotion locomotion = (Locomotion)robots[i];
        locomotion.stop();
      }
    }
  }
}

interface Locomotion {
  void forward();
  void reverse();
  void stop();
}

interface Sound {
  void beep();
}

abstract class Robot {
}

class RobotA extends Robot {
}

class RobotA1 extends RobotA
implements Sound {

  public void beep() {
    System.out.println("RobotA1: beep");
  }
}

class RobotB extends Robot 
implements Locomotion {

  public void forward() {
    System.out.println("RobotB: forward");
  }

  public void reverse() {
    System.out.println("RobotB: reverse");
  }

  public void stop() {
    System.out.println("RobotB: stop");
  }
}

class RobotB1 extends RobotB 
implements Sound {
 
  public void beep() {
    System.out.println("RobotB1: beep");
  }
}

class RobotB2 extends RobotB {
}

class RobotC extends Robot
implements Locomotion, Sound {

  public void forward() {
    System.out.println("RobotC: forward");
  }

  public void reverse() {
    System.out.println("RobotC: reverse");
  }

  public void stop() {
    System.out.println("RobotC: stop");
  }

  public void beep() {
    System.out.println("RobotC: beep");
  }
}

class RobotC1 extends RobotC {
}