# MIBIIW10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

What will be the output of the following Java program?

```
interface Printer {
    void print();
    default void start() {
        System.out.println("Starting printer...");
    }
}

class LaserPrinter implements Printer {
    public void print() {
        System.out.println("Printing from LaserPrinter");
    }
    
    public void start(String message) {
        System.out.println(message);
    }
}

class Codechef {
    public static void main(String[] args) {
        Printer printer = new LaserPrinter();
        printer.print();
        printer.start();
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:10:55.841Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/MIBIIW10)