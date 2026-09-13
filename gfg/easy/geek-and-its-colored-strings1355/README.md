# Colorful Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Find the number of distinct strings of length  **n** that can be formed using only the characters 'R', 'B', and 'G', such that the string contains at least  **r**  occurrences of 'R', at least  **b**  occurrences of 'B', and at least **g** occurrences of 'G'.

 **Examples:** 

```
Input: n = 3, r = 1, b = 1, g = 1
Output: 6 
Explanation: The string must contain exactly one 'R', one 'B', and one 'G'. All possible arrangements are: RBG, RGB, BRG, BGR, GRB and GBR. So the answer is 6.

```

```
Input: n = 3, r = 2, b = 1, g = 0
Output: 3
Explanation: Three possible arrangements are: RRB, RBR and BRR. So the answer is 3.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:16:54.890Z  

```java
class Solution {
    static long fact(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    long countStrings(int n, int r, int b, int g) {
        int remaining = n - (r + b + g);
        if (remaining < 0) {
            return 0;
        }

        long ans = 0;
        long nFact = fact(n);

        for (int i = 0; i <= remaining; i++) {
            for (int j = 0; j <= remaining - i; j++) {
                int k = remaining - i - j;

                int totalR = r + i;
                int totalB = b + j;
                int totalG = g + k;

                long count = nFact / (fact(totalR) * fact(totalB) * fact(totalG));
                ans += count;
            }
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/geek-and-its-colored-strings1355/1)