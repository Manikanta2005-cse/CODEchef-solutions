# CMOOVU05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Zero Matrix Initialization

Write a program that declares a  **2x2 integer matrix**  and initializes its values using user input. The program should store four integers and display them in matrix format.

 **Input:** 
Four integers represent the elements of the 2x2 matrix.

### Sample 1:
Input
Output

```
0
0
0
0

```

```
Matrix:
0 0
0 0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:16:15.574Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare a 2x2 matrix
        int[][] matrix = new int[2][2];

        // Take user input for each element
        System.out.println();
        matrix[0][0] = scanner.nextInt();
        matrix[0][1] = scanner.nextInt();
        matrix[1][0] = scanner.nextInt();
        matrix[1][1] = scanner.nextInt();

        // Display the matrix
        System.out.println("Matrix:");
        System.out.println(matrix[0][0] + " " + matrix[0][1]);
        System.out.println(matrix[1][0] + " " + matrix[1][1]);

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CMOOVU05)