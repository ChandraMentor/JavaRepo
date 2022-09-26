class Person {
  String name;
  int age;
  
  public Person(String name,int age) {
    this.name = name;
    this.age = age;
  }
  private Person() {
  System.out.println("In Private Constructor");
  }
}
class PrivateConstructor {
public static void main(String args[]) {
// Public constructor may be invoked
Person p1 = new Person("John", 30);
System.out.println(p1.name);
System.out.println(p1.age);
// Private constructor may not be invoked
Person p2 = new Person();
  }
}