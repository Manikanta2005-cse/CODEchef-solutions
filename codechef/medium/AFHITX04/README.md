# AFHITX04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given three integers representing the lengths of the sides of a triangle. Your task is to determine the type of triangle based on the side lengths. However, there's a catch! The code has a potential initialization error that you need to fix.

Specifically, write a Java program that takes three integer inputs representing the sides of a triangle and prints whether the triangle is "Equilateral", "Isosceles", or "Scalene".

- Equilateral: All three sides are equal.
- Isosceles: Exactly two sides are equal.
- Scalene: No sides are equal.

Fix the compilation error caused by the uninitialized variable.

### Sample 1:
Input
Output

```
5 5 5
```

```
Equilateral
```

### Sample 2:
Input
Output

```
4 4 5
```

```
Isosceles
```

### Sample 3:
Input
Output

```
3 4 5
```

```
Scalene
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T17:09:39.331Z  

```java
import java.util.Scanner;

class TriangleType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        String triangleType;

        if (side1 == side2 && side2 == side3) {
            triangleType = "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            triangleType = "Isosceles";
        } else {
            triangleType = "Scalene";
        }

        System.out.println(triangleType);
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/AFHITX04)