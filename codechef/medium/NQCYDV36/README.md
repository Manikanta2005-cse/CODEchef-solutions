# NQCYDV36

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Logical Error in Calculating Average

Here in the prepopulated code we have logical error. Try to solve the logical error.

Consider the formula for calculating the average:

```
Average = (num1 + num2 + num3) / 3

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T16:56:38.162Z  

```java
class CodeChef {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;
        double average = (num1 + num2 + num3) / 3;  // Logical error: Wrong precedence

        System.out.println("The calculated average is: " + average); // it will print 40.0, which is wrong
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NQCYDV36)