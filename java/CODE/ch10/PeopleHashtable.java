import java.util.*;

class Person {
  String name, telephone, fax, email;

  Person(String name, String telephone, String fax, String email) {
    this.name = name;
    this.telephone = telephone;
    this.fax = fax;
    this.email = email;
  }

  public String toString() {
    return name + "; " + telephone + "; " + fax + "; " + email;
  }
}

class PeopleHashtable {

  public static void main(String args[]) {

    // Create a hashtable and populate it
    Hashtable hashtable = new Hashtable();
    Person p1 = new Person("Susan", "5634", "2343", "sue");
    hashtable.put("111111111", p1);
    Person p2 = new Person("Claire", "4545", "3331", "claire");
    hashtable.put("222222222", p2);
    Person p3 = new Person("Kim", "9821", "9899", "kim");
    hashtable.put("333333333", p3);
    Person p4 = new Person("Viviane", "4689", "2211", "viv");
    hashtable.put("444444444", p4);
    Person p5 = new Person("Barbara", "1212", "6655", "barb");
    hashtable.put("555555555", p5);


    // Display the elements of the hashtable
    Enumeration e = hashtable.keys();
    while(e.hasMoreElements()) {
      Object k = e.nextElement();
      Object v = hashtable.get(k);
      System.out.println("key = " + k + "; value = " + v);
    } 
  }
}
    