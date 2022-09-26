class PrivateConstructor1 {
  String name;
  int age;
  
  public PrivateConstructor1(String name,int age) {
    this.name = name;
    this.age = age;
  }
  private PrivateConstructor1() {
   System.out.println("In Private Constructor");
  }
public static void main(String args[]) {
// Public constructor may be invoked
PrivateConstructor1 p1 = new PrivateConstructor1("John", 30);
 System.out.println(p1.name);
 System.out.println(p1.age);
PrivateConstructor1 p2 = new PrivateConstructor1();
PrivateConstructor1 p3 = new PrivateConstructor1();
  }
}
    