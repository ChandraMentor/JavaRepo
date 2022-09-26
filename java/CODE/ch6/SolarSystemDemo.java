class Planet {
  public String name;
  public int moons;

  Planet(String name, int moons) {
    this.name = name;
    this.moons = moons;
  }
  void display() {
    System.out.println(name + " has " + 
      moons + " moons");
  }
}

class SolarSystem {
  Planet planets[];

  SolarSystem() {

    // Create planets
    planets = new Planet[9];
    planets[0] = new Planet("Mercury", 0);
    planets[1] = new Planet("Venus", 0);
    planets[2] = new Planet("Earth", 1);
    planets[3] = new Planet("Mars", 2);
    planets[4] = new Planet("Jupiter", 16);
    planets[5] = new Planet("Saturn", 18);
    planets[6] = new Planet("Uranus", 15);
    planets[7] = new Planet("Neptune", 8);
    planets[8] = new Planet("Pluto", 1);
  }

  void display() {
    for(int i = 0; i < planets.length; i++) {
      planets[i].display();
    }
  }
}

class SolarSystemDemo {

  public static void main(String args[]) {
    SolarSystem solarSystem = new SolarSystem();
    solarSystem.display();
  }
}