# Non-Repetitive String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string **s**  consisting of uppercase English letters, determine whether it is a non-repetitive string. A string is called non-repetitive if every occurrence of the same character appears in a single contiguous block.

 **Examples:** 

```
Input: s = "AABBCCCCC"
Output: true
Explanation: Each character appears in a single contiguous block.

```

```
Input: s = "ABA"
Output: false
Explanation: The character 'A' appears again after a different character.
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:08:32.740Z  

```java
import java.util.HashSet;
 import java.util.Set;

 class Solution {
     public boolean nonRepetitive(String s) {
         Set<Character> seen = new HashSet<>();
         char prev = '\0';

         for (int i = 0; i < s.length(); i++) {
             char curr = s.charAt(i);
             if (curr != prev) {
                 if (seen.contains(curr)) {
                     return false;
                 }
                 seen.add(curr);
                 prev = curr;
             }
         }
         return true;
     }
 }
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-non-repetitive-string5955/1)