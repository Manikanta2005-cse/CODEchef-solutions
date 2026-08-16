# CMOOVU03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked example - Exploring Two-Dimensional Arrays

In this example, we demonstrate how to declare and initialize a  **2D array**  in Java. This example focuses on:

- Declaring a 3x3 matrix
- Initializing the array with specific values
- Printing the matrix in a structured format

 **Output** 

```
Declaring a 3x3 matrix: 
1 2 3 
4 5 6 
7 8 9

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:15:26.335Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declare and initialize a 3x3 matrix with predefined values
        int[][] matrix = {
            {1, 2, 3},  // First row
            {4, 5, 6},  // Second row
            {7, 8, 9}   // Third row
        };

        // Print a message indicating matrix declaration
        System.out.println("Declaring a 3x3 matrix:");

        // Print the matrix in a structured format (without using loops)
        System.out.println(matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2]); // Print first row
        System.out.println(matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2]); // Print second row
        System.out.println(matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2]); // Print third row
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CMOOVU03)