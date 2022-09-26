class Person2 {
  String name;
  int age;
 float salary;

  Person2(String aname, int aage, float asalary) {
    name = aname;
    age = aage;
    salary = asalary;
  }
}

class PersonConstructor {

public static void main(String args[]) {

Person2 p = new Person2("John", 21, 29100f);
System.out.println("p.name = " + p.name);
System.out.println("p.age = " + p.age);
 System.out.println("p.salary = " + p.salary);
  }
}