class Person1 {
  String name;
  int age;
  
  public Person1(String name,int age) {
 this.name = name;
this.age = age;
  }
  private Person1() {
  System.out.println("In Private Constructor");
  }
public static void main(String args[]) {
 // Public constructor may be invoked
Person1 p1 = new Person1("John", 30);
System.out.println(p1.name);
System.out.println(p1.age);
// Private constructor may not be invoked
Person1 p2 = new Person1();
  }
}