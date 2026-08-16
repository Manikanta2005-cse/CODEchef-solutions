# CMOOVU04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Printing a 3x3 Integer Matrix in Java

Consider the Java code below that initializes a 3x3 game board matrix and prints it. What will be the output of this code?

```
class Codechef {
    public static void main(String[] args) {

        int[][] gameBoard = {
            {1, 2, 3},  // First row
            {4, 5, 6},  // Second row
            {7, 8, 9}   // Third row
        };

        System.out.println(gameBoard[0][0] + " " + gameBoard[1][0] + " " + gameBoard[2][0]); 
        System.out.println(gameBoard[0][1] + " " + gameBoard[1][1] + " " + gameBoard[2][1]); 
        System.out.println(gameBoard[0][2] + " " + gameBoard[1][2] + " " + gameBoard[2][2]); 
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:15:53.455Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/CMOOVU04)