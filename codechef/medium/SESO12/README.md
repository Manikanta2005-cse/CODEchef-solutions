# SESO12

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sort three integer

You are tasked with sorting a 3-integer array manually, without using any built-in sorting functions or libraries. Implement a program that reads three integers from input and rearranges them in ascending order.

### Input Format:
- Three integers separated by spaces on a single line.
### Output Format:
- Print the three integers in ascending order, separated by spaces.
### Sample 1:
Input
Output

```
5 2 7

```

```
2 5 7
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T15:09:12.242Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            if (a > b) { int temp = a; a = b; b = temp; }
            if (b > c) { int temp = b; b = c; c = temp; }
            if (a > b) { int temp = a; a = b; b = temp; }
            
            System.out.println(a + " " + b + " " + c);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SESO12)