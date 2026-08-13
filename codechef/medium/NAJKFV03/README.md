# NAJKFV03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Shape Abstraction
- In this example, we demonstrate how abstraction works in object-oriented programming by designing a generic blueprint for different shapes.
- We define an abstract concept of a Shape using a base class that includes common properties and behaviors, such as the shape's name and a method getArea(). Although the base class provides a default implementation of getArea(), which returns 0.0 by default. It is intended to be overridden by subclasses to provide specific area calculation logic.
- Subclasses like Circle and Square extend the Shape class and provide their own implementations of getArea(), hiding the internal calculation details from the user. This way, users can work with shapes in a general way, without needing to know the specifics of how each shape computes its area.

 **When executed, the code will show::** 

```
Circle Area: 78.53981633974483  
Square Area: 16.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:18:40.390Z  

```java
class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        // Default implementation, can be overridden by subclasses
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

class Codechef {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);

        System.out.println(circle.getName() + " Area: " + circle.getArea());
        System.out.println(square.getName() + " Area: " + square.getArea());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NAJKFV03)