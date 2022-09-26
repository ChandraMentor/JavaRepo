abstract class Widget {
  String color;
  abstract int getMass();
  public String toString() {
    return getClass().getName() + ": " + 
      color + ", " + getMass();
  }
}

class WidgetA extends Widget {
  final static int MASS = 4;

  WidgetA(String color) {
    this.color = color;
  }

  int getMass() {
    return MASS;
  }
}


class WidgetB extends Widget {
  final static int MASS = 1;

  WidgetB(String color) {
    this.color = color;
  }

  int getMass() {
    return MASS;
  }
}

class WidgetC extends Widget {
  final static int MASS = 5;

  WidgetC(String color) {
    this.color = color;
  }

  int getMass() {
    return MASS;
  }
}

class WidgetD extends Widget {
  final static int MASS = 17;

  WidgetD(String color) {
    this.color = color;
  }

  int getMass() {
    return MASS;
  }
}

class WidgetTypes {
  static int NUMWIDGETS = 6;

  public static void main(String args[]) {

    // Declare and allocate space for the widgets
    Widget widgets[] = new Widget[NUMWIDGETS];

    // Create widgets 
    widgets[0] = new WidgetC("Red");
    widgets[1] = new WidgetA("Green");
    widgets[2] = new WidgetD("Yellow");
    widgets[3] = new WidgetB("Magenta");
    widgets[4] = new WidgetA("Black");
    widgets[5] = new WidgetC("White");

    // Process widgets
    int totalMass = 0;
    for(int i = 0; i < NUMWIDGETS; i++) {
      Widget w = widgets[i];
      System.out.println(w);
      totalMass += w.getMass();
    }

    // Display total mass
    System.out.println("Total mass = " + totalMass);
  }
}