# AFHITX05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of integers. Your task is to calculate the product of all the elements in the array. However, integer overflow can occur if the product becomes too large to be stored in an `int`. You need to implement a mechanism to detect and handle potential integer overflows. If an overflow occurs during the multiplication, print "Overflow Detected" and stop further calculations. Otherwise, print the final product.

### Sample 1:
Input
Output

```
4
2 3 4 5
```

```
120
```

### Explanation:

2 × 3 × 4 × 5 = 120 — within `int` range

### Sample 2:
Input
Output

```
3
100000 30000 800
```

```
Overflow Detected
```

### Explanation:

100000 × 30000 = 3,000,000,000 ? exceeds `int` max (2,147,483,647)

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T17:11:45.390Z  

```java
import java.util.Scanner;

class OverflowProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int product = 1;
        for (int i = 0; i < n; i++) {
            //Implement overflow detection logic here
            product = product * arr[i];
        }

        System.out.println(product);
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/AFHITX05)