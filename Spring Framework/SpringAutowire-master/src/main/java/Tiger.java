// package com.javacodegeeks.snippets.enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// Auto-Wiring with @Autowired annotation
// The @Autowired annotation can be used to auto wire a bean on the setter method,
// constructor or a field.
// 1. Setter
// 2. Ctor
// 3. Field
// 4. required=false
// 5. How to set different colors, by using a different bean for Color

public class Tiger {

    private String name;

    // 5. Works
    @Autowired
    @Qualifier("differentColors")
    private Color color;

//    // 3. Field - worked
//    // @Autowired
//    private Color color;

    // Had to add this, to get past an error.
    public Tiger(){}

    // 2. Ctor - worked
    // @Autowired
	public Tiger(Color color) {
		this.color = color;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    // 1. Setter - worked
    // @Autowired
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "The " + name + " has " + color.toString();
    }
}
