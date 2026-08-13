# OPJA133

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Shape Area Calculation

You are tasked with creating a basic shape modeling application with two types of shapes: `Square` and `Rectangle`.
Both shape types should be derived from an abstract base class called `Shape`.
Each shape should have an area calculation method.

Implement the `Shape` class with abstract functions.

```
abstract int calculateArea();

```

Implement the `Square` class and `Rectangle` class as derived classes from `Shape`, and provide the necessary implementations for the `calculateArea()` method.

Create instances of both `Square` and `Rectangle`, calculate and display their areas.

### Input Format
- First line contain one integer representing side of square.
- Second line contain two integers representing length and breadth of square respectively
### Output Format

Print area of square on first line and area of rectangle on second line.

### Sample 1:
Input
Output

```
2
2 3
```

```
4
6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:16:40.889Z  

```java
import java.util.Scanner;

// Abstract base class Shape
abstract class Shape {
    // Abstract method for calculating area
    public abstract int calculateArea();
}

// Derived class Square
class Square extends Shape {
    int side;

    Square(int sideLength) {
        side = sideLength;
    }

    // Implementation of calculateArea for Square
    @Override
    public int calculateArea() {
        return side * side;
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea for Rectangle
    @Override
    public int calculateArea() {
        return length * width;
    }
}

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareSide, rectangleLength, rectangleWidth;
        squareSide = scanner.nextInt();
        rectangleLength = scanner.nextInt();
        rectangleWidth = scanner.nextInt();

        // Create a Square with a side length
        Square square = new Square(squareSide);

        // Create a Rectangle with length and width
        Rectangle rectangle= new Rectangle(rectangleLength, rectangleWidth);

        // Calculate and display the areas
        System.out.println(square.calculateArea());
        System.out.println(rectangle.calculateArea());
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA133)