abstract class Fruit {
  String color;

  public String toString() {
    return getClass().getName() + ": " +
      color;
  }
}

class Apple extends Fruit {

  Apple() {
    color = "Red";
  }
}

class Banana extends Fruit {

  Banana() {
    color = "Yellow";
  }
}

class Orange extends Fruit {

  Orange() {
    color = "Orange";
  }
}

class Strawberry extends Fruit {

  Strawberry() {
    color = "Red";
  }
}

class FruitTypes {
  public static void main(String args[]) {
    Fruit fruit = new Apple();
    System.out.println(fruit);
    fruit = new Banana();
    System.out.println(fruit);
    fruit = new Orange();
    System.out.println(fruit);
    fruit = new Strawberry();
    System.out.println(fruit);
  }
}