# DPNMAO24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Last Word Length

You are given a string $S$ which consists of words and spaces.
Your task is to find the length of the last word in the string. A word is defined as a maximal substring consisting of non space characters only. The string may have leading or trailing spaces.

### Input Format
- The first and only line of input contains the string $S$.
### Output Format
- Print a single integer representing the length of the last word.
### Constraints
- $1 \leq |S| \leq 10^5$
### Sample 1:
Input
Output

```
  I am  a passionate   Developer  
```

```
9
```

### Sample 2:
Input
Output

```
Hello World
```

```
5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T15:53:09.385Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        System.out.println(length);
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DPNMAO24)