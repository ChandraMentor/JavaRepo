// package com.javacodegeeks.snippets.enterprise;

// Auto-Wiring ‘byName’
// We are using the Dog.java class to wire the color bean in the auto-wiring byName mode.

// Auto-Wiring ‘byName’ : Autowiring by property name.
// Spring looks for a bean with the same name as the property that needs to be autowired.
// In this case the class Dog has a private declaration of "Color".

public class Dog {
    private String name;
    private Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "The " + name + " has " + color.toString();
    }
}
