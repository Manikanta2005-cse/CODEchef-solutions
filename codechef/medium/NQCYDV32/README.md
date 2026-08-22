# NQCYDV32

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Division by Zero in a Calculator

In this example, we demonstrate how a run-time error can occur when attempting to divide by zero in Java.

You have predefined values for the numerator and denominator:

```
int numerator = 10;
int denominator = 0;

```

- When you try to divide the numerator by the denominator, it results in an ArithmeticException.
- Dividing by zero is mathematically undefined, and Java throws an error when this operation is attempted.

When executed, the code will display:

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at CodeChef.main(Main.java:8)

```

 **Change the denominator to 1 to avoid the error and get correct output.**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T16:54:42.032Z  

```java
import java.util.Scanner;

class CodeChef {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 1; // Change the denominator to 1 to avoid the error and get correct output.
        int result = numerator / denominator;
        System.out.println("Age is " + result);
}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NQCYDV32)