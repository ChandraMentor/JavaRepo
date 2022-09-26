class Singleton {
static Singleton singleton;

private Singleton(){
  }
public static Singleton getInstance() {
    if(singleton == null) 
    singleton = new Singleton();
    return singleton;
  }
}

class SingletonDemo {
  public static void main(String args[]) {
  Singleton s1 = Singleton.getInstance();
  Singleton s2 = Singleton.getInstance();

/*  Singleton s3 = new Singleton();
  Singleton s4 = new Singleton();*/

    if(s1 == s2)
    System.out.println("Equal");
    else
    System.out.println("Not equal");
  }
}    