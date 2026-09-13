# Remove Characters Present in  Other

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1** and  **s2**, remove every character from s1 that is present in s2. Return the resulting string. Both strings contain only lowercase English letters, and |s1| > |s2|.

 **Examples:** 

```
Input: s1 = "computer", s2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t) from string1 we get "ompuer".
```

```
Input: s1 = "occurrence", s2  = "car"
Output: "ouene"
Explanation: After removing characters (c, a, r) from string1 we get "ouene".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:00:35.049Z  

```java
class Solution {
    public String removeChars(String s1, String s2) {
        boolean[] present = new boolean[256];
        for (int i = 0; i < s2.length(); i++) {
            present[s2.charAt(i)] = true;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!present[ch]) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-character3815/1)