# Just One Mismatch

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**  and an array of strings  **arr[]**, find if any string in arr[] of the same length as s differs from it at exactly one position. 

 **Examples:** 

```
Input: arr[] = ["bana", "apple", "banaba", "bonaba"], s = "banana"
Output: true
Explanation: "banana" and "banaba" have the same length and differ at exactly one position.
```

```
Input: arr[] = ["bana", "apple", "banaba", "bonanzo"], s = "apple"
Output: false
Explanation: No string in the array differs from "apple" by exactly one character.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:43:47.160Z  

```java
class Solution {
    public boolean isStringExist(String s, String[] arr) {
        int targetLen = s.length();
        for (String str : arr) {
            if (str.length() != targetLen) {
                continue;
            }
            int diffCount = 0;
            for (int i = 0; i < targetLen; i++) {
                if (s.charAt(i) != str.charAt(i)) {
                    diffCount++;
                    if (diffCount > 1) {
                        break;
                    }
                }
            }
            if (diffCount == 1) {
                return true;
            }
        }
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/just-one-mismatch1714/1)