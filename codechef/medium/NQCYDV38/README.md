# NQCYDV38

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Incorrect Index

Strings in Java have zero-based indexing.
This means that the first index is 0.
It is easy to forget that and use one-based indexing instead.
This incorrect indexing leads to another logical error.

 **Program to print the last character of the string** 

```
Scanner scanner = new Scanner(System.in);
String s = scanner.nextLine();    // input string
int n = s.length();               // find length of string
        
System.out.println(s.charAt(n - 1));   // Correct way to access the n-th character
System.out.println(s.charAt(n));       // incorrect way

```

### Task
- Given a program to print 1st, 4th and 6th character of a string
- Find out the logical error and solve it
### Sample 1:
Input
Output

```
hellohowudoing
```

```
hlh
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T16:57:33.999Z  

```java
import java.util.Scanner;

class CodeChef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("" + s.charAt(0) + s.charAt(3) + s.charAt(5));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NQCYDV38)