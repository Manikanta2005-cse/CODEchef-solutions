# The Modified String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, a string is considered valid if it does not contain three consecutive identical characters. You may insert characters at any position in the string.

Return the  **minimum**  number of insertions required to make s valid.

 **Examples:** 

```
Input: s = "aabbbcc"
Output: 1
Explanation: In "aabbbcc" 3 b's occur consecutively, we need to add a 'd', and Hence, the output will be "aabbdbcc".

```

```
Input: s = "aaaaa"
Output: 2
Explanation: In "aaaaa" 5 a's occur consecutively, we need to add 2 'b', and Hence, the output will be "aababaa".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:02:55.790Z  

```java
class Solution {
    public static long modified(String a) {
        long count = 0;
        int sameCount = 1;

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                sameCount++;
            } else {
                count += (sameCount - 1) / 2;
                sameCount = 1;
            }
        }
        count += (sameCount - 1) / 2;

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-modified-string-1587115621/1)