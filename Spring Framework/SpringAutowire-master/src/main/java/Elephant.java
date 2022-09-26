// package com.javacodegeeks.snippets.enterprise;

// Auto-Wiring ‘byType’
// The Elephant.java class will be used to wire the color bean with auto-wiring byType mode.

public class Elephant {

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
        this.color= color;
    }

    @Override
    public String toString() {
        return "The " + name + " has " + color.toString();
    }
}
