# Special String Comparison

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1**  and  **s2**  and compare them on the basis of a special priority order where we have " **ng** " between n and o. 

- The order of characters is a, b, c, d, e, f, g, h, i, j, k, l, m, n, ng, o, p, q, r, s, t, u, v, w, x, y, z.
- Return 0 if both the strings are equal, 1 if s1 is greater than s2, and -1 if s1 is lesser than s2.

 **Examples:** 

```
Input: s1 = "adding", s2 = "addio"
Output: -1
Explanation: 'o' has greater priority than 'ng'
```

```
Input: s1 = "abcng", s2 = "abcno"
Output: 1
Explanation: 'ng' has greater priority than 'n'
```

 **Constraints:** 
1 ≤ |s1|, |s2| ≤ 105
The string contains lower case English alphabets

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:04:57.029Z  

```java
class Solution {
    public int compareStrings(String s1, String s2) {
        int i = 0, j = 0;
        int n1 = s1.length(), n2 = s2.length();

        while (i < n1 && j < n2) {
            int p1 = getPriority(s1, i);
            int p2 = getPriority(s2, j);

            if (p1 != p2) {
                return p1 > p2 ? 1 : -1;
            }

            i += (p1 == 14) ? 2 : 1;
            j += (p2 == 14) ? 2 : 1;
        }

        if (i < n1) return 1;
        if (j < n2) return -1;
        return 0;
    }

    private int getPriority(String s, int index) {
        if (index + 1 < s.length() && s.charAt(index) == 'n' && s.charAt(index + 1) == 'g') {
            return 14;
        }

        char c = s.charAt(index);
        int val = c - 'a';

        if (c > 'n') {
            return val + 1;
        }
        return val;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/string-comparison5858/1)