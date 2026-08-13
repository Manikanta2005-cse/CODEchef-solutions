# OPJA124

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### How to use Interfaces in Java

In Java, an interface is a blueprint for a class. It specifies a set of methods that any class implementing the interface must provide. Let's expand on the explanation with a bit more detail:

- Shape Interface: In this code, an interface called Shape is defined. An interface in Java is like a blueprint for classes. It specifies a set of methods that any class implementing the interface must provide. In this case, Shape declares two methods, area() and perimeter(), which are intended to be implemented by any class that claims to be a shape.
- Circle and Rectangle Classes: Two classes, Circle and Rectangle, are created in the code. These classes implement the Shape interface, signifying that they promise to provide implementations for the area() and perimeter() methods, as mandated by the interface. The Circle class has a private field, radius, representing the radius of a circle. It contains a constructor to set the radius and implements area() and perimeter() methods, using the well-known formulas for calculating the area and perimeter of a circle. The Rectangle class, on the other hand, has private fields for length and width to describe a rectangle's dimensions. It, too, implements area() and perimeter() methods, using formulas appropriate for rectangles.
- The Codechef Class: Inside the main method, instances of Circle and Rectangle are created. A Circle object is instantiated with a radius of 5.0, and a Rectangle object is instantiated with dimensions of 4.0 and 6.0. The program then proceeds to use these objects to calculate and display the area and perimeter for each shape.

In summary, this code showcases the use of Java interfaces to define a common set of methods that different classes (in this case, `Circle` and `Rectangle`) must implement.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:07:02.143Z  

```java
// Define an interface named "Shape"
interface Shape {
    double area();  // Method to calculate the area of a shape
    double perimeter();  // Method to calculate the perimeter of a shape
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Codechef {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle - Area: " + circle.area() + ", Perimeter: " + circle.perimeter());
        System.out.println("Rectangle - Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA124)