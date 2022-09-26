abstract class JetPlane {
abstract int numEngines();
}
class DC8 extends JetPlane {
  int numEngines() {
    return 4;
  }
}

class DC10 extends JetPlane  {
  int numEngines() {
    return 3;
  }
}

class JetPlanes {
  public static void main(String args[]) {
 
 System.out.println(new DC8().numEngines());
 System.out.println(new DC10().numEngines());
  }
}