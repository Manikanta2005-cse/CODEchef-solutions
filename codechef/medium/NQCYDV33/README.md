# NQCYDV33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Runtime Error

You are writing a function that returns the character at a specified index in a string. Below is the code snippet.

```
String str = "Hello123";
char charAtIndex = str.charAt(10);
System.out.println(charAtIndex);

```

The following error is raised during execution:

```
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 10 out of bounds for length 8
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
	at java.base/java.lang.String.checkIndex(String.java:4832)

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T16:56:06.662Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/NQCYDV33)