import java.lang.*;
//base class
class M100 {
//instance variable
int i=100;
}
//derived class
class M200 extends M100 {
int i=200;
void display() {
System.out.println("i = " + i);
//cout << "The value of i is" << ::i;
System.out.println("super.i =" + super.i);
  }
}
class M300 extends M200 {
int i=500;
void display1()	{
System.out.println("i=" + i);
System.out.println("super.i" + super.i);
  }
}
class SuperKeyword {
public static void main(String args[]) {
M200 m200 = new M200();
m200.display();
M300 m300 = new M300();
m300.display1();
  }
}