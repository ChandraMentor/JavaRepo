class Person {
   //instance variable
  String name;
   int age;
  float salary;
}
class PersonExample {
  public static void main(String args[]) {
Person p = new Person();
    p.name = "John Doe";
    p.age = 21;
    p.salary  = 29100f;
System.out.println("p.name = " + p.name);
System.out.println("p.age = " + p.age);
System.out.println("p.salary = " + p.salary);
  }
}