# CMOOVU30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Row-wise and Column-wise Sum in a 2D Array

Write a program to compute the  **row-wise and column-wise sums**  of a  **3×3 sales matrix**, where each row represents a branch and each column represents a month. First, take  **9 integer inputs**  to fill the matrix. Then, compute and display the  **total sales for each branch**  and  **each month**.

 **Input:** 
A  **3×3 integer matrix**, entered row by row.

### Sample 1:
Input
Output

```
10 20 30
15 25 35
5 10 15
```

```
Row 0 total: 60  
Row 1 total: 75  
Row 2 total: 30  
Column 0 total: 30  
Column 1 total: 55  
Column 2 total: 80  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:22:12.530Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create and fill a 3x3 array
        int[][] sales = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sales[i][j] = scanner.nextInt();
            }
        }

        // Step 2: Row-wise sum
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += sales[i][j];
            }
            System.out.println("Row " + i + " total: " + rowSum);
        }

        // Step 3: Column-wise sum
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += sales[i][j];
            }
            System.out.println("Column " + j + " total: " + colSum);
        }

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CMOOVU30)