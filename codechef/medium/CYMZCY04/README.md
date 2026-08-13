# CYMZCY04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Abstract Class for Shapes

In this practice problem, you will learn how to apply abstraction using abstract classes in Java. You are provided with an abstract class `Shape` and two concrete subclasses: `Circle` and `Rectangle`.

 **Task** 
Complete the missing lines in the code to:

- Declare the Shape class as abstract using the abstract keyword.
- Declare a private instance variable name in the Shape class.
- Create a constructor in the Shape class to initialize the name.
- Implement a getter method getName() to return the shape’s name.

The subclasses `Circle` and `Rectangle` must:

- Inherit from the Shape class.
- Use the super keyword to call the parent class constructor.

 **Expected Output:** 

```
MyCircle area: 78.53981633974483
MyRectangle area: 24.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:26:35.114Z  

```java

// Define the abstract class Shape here
abstract class Shape {
    // Declare a private String variable name
    private String name;
    
    // Define a constructor that takes a String parameter name
    public Shape(String name) {
        this.name = name;
    }
    
    // Define a method getName() that returns the name
    public String getName() {
        return name;
    }
    
    // Abstract method calculateArea() that returns area
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea() {
        return length * width;
    }
}

class Codechef {
    public static void main(String[] args) {
        Circle circle = new Circle("MyCircle", 5);
        Rectangle rectangle = new Rectangle("MyRectangle", 4, 6);
        
        System.out.println(circle.getName() + " area: " + circle.calculateArea());
        System.out.println(rectangle.getName() + " area: " + rectangle.calculateArea());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CYMZCY04)