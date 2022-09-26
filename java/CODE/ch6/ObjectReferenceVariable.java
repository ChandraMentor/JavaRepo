class Parent {
}

class Child extends Parent {
}

class ObjectReferenceVariable {
  public static void main(String args[]) {
    Parent p;
    p = new Parent();
    p = new Child();
    Child c;
    c = new Child();
    c = new Parent();
  }
}
