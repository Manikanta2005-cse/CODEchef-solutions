# SESO07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find smallest and largest numbers

Write a program to find the  **smallest**  and  **largest**  elements in an array of integers.

### Input Format
- The first line contains an integer n, representing the number of elements in the array.
- The second line contains n integers separated by spaces, representing the elements of the array.
### Output Format
- Print the smallest and largest elements in the array on a single line, separated by a space.
### Sample 1:
Input
Output

```
10
4 3 53 13 2 44 55 35 56 34
```

```
2 56
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T16:40:37.610Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        if (n <= 0) return;
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        System.out.println(min + " " + max);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SESO07)