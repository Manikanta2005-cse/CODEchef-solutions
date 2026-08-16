# CMOOVU18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Iterating 2D Arrays with Loop

In this example, we demonstrate iterating over a 2D array in Java using nested loops, essential for searching, modifying, and displaying matrix data in algorithms, simulations, and data processing.

 **Expected Output:** 

```
Iterating over a 3x3 matrix:
Row 1: 10 20 30
Row 2: 40 50 60
Row 3: 70 80 90

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:17:14.466Z  

```java
class Codechef {

    public static void main(String[] args) {
        // Define a 3x3 matrix with predefined values
        int[][] matrix = {
            {10, 20, 30}, // Initialize row 1 of the matrix
            {40, 50, 60}, // Initialize row 2 of the matrix
            {70, 80, 90}  // Initialize row 3 of the matrix
        };

        // Print a header to indicate the start of matrix iteration
        System.out.println("Iterating over a 3x3 matrix:");
        for (int i = 0; i < matrix.length; i++) { // Loop over each row of the matrix
            System.out.print("Row " + (i + 1) + ": "); // Print the row number
            for (int j = 0; j < matrix[i].length; j++) { // Loop over each column in the current row
                System.out.print(matrix[i][j] + " "); // Print each element in the row followed by a space
            }
            System.out.println(); // Move to the next line after printing all columns in a row
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CMOOVU18)