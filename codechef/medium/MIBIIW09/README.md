# MIBIIW09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Shape Drawer
- Imagine you are designing a drawing application where different shapes can be drawn on the screen. To ensure a consistent structure, every shape must follow a common interface that defines a draw() method.
- You are given an interface Drawable that declares a method draw(). You need to complete the implementation of two classes: Circle and Square, both of which implement the Drawable interface. Each class must provide its own version of the draw() method to display a message indicating which shape is being drawn.

 **Task** 

- Define the Drawable interface and declare an abstract method draw().
- Implement the Drawable interface in the Circle and Square classes.
- Override the draw() method in both classes: In Circle → print: Drawing a circle In Square → print: Drawing a square
- In the main() method: Call the draw() method on both objects.

 **Expected Output:** 

```
Drawing a circle  
Drawing a square

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:10:16.343Z  

```java
// Define the Drawable interface
interface Drawable {
    // Declare a method 'draw()' to draw shapes
    void draw();
}

class Circle implements Drawable {
    // Override the draw method for Circle
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
}

class Square implements Drawable {
    // Override the draw method for Square
    public void draw() {
        System.out.println("Drawing a square");
    }
    
}

class Codechef {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable square = new Square();
        // Call the draw method on both shapes
        circle.draw();
        square.draw();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MIBIIW09)