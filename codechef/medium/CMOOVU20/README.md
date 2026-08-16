# CMOOVU20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Calculating Total Marks with 2D Array Iteration

Write a program to compute the  **total marks**  of students using a  **3×3 2D array**. First, take user input to populate the matrix with integer marks. Then, using  **nested loops**, calculate and display the  **total marks for each student**.

 **Input:** 
A  **3×3 matrix**  of integers, where each row represents a student’s marks across subjects.

### Sample 1:
Input
Output

```
70 80 90
60 75 85
88 92 77
```

```
Total marks for student 0: 240
Total marks for student 1: 220
Total marks for student 2: 257
```

### Sample 2:
Input
Output

```
50 60 70  
55 65 75  
80 85 90  

```

```
Total marks for student 0: 180
Total marks for student 1: 195
Total marks for student 2: 255
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:19:45.920Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create a 3x3 integer 2D array
        int[][] marks = new int[3][3];

        // Step 2: Read 9 integers to fill the array row by row
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner.nextInt();
            }
        }

        // Step 3: Use nested loops to calculate total marks per student (row-wise)
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            System.out.println("Total marks for student " + i + ": " + total);
        }

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CMOOVU20)