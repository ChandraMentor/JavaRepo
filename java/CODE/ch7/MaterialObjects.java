interface Material {
  String bronze = "bronze";
  String gold = "gold";
  String marble = "marble";
  String silver = "silver";
  String wood = "wood";
}

abstract class MaterialObject {
  String material;
}

class Ball extends MaterialObject {
  Ball(String material) {
    this.material = material;
  }
}

class Coin extends MaterialObject {
  Coin(String material) {
    this.material = material;
  }
}

class Ring extends MaterialObject {
  Ring(String material) {
    this.material = material;
  }
}

class MaterialObjects {
  public static void main(String args[]) {
    Ball ball = new Ball(Material.wood);
    Coin coin = new Coin(Material.silver);
    Ring ring = new Ring(Material.gold);
    System.out.println(ball.material);
    System.out.println(coin.material);
    System.out.println(ring.material);
  }
}
    