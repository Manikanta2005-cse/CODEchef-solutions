# Repeating Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, return the index of the first character that appears more than once in the string. If there is no repeated character, return -1.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: 0
Explanation: We see that both 'e' and 'g' repeat as we move from left to right.But the leftmost is 'g' so we return leftmost index of 'g' that is 0.

```

```
Input: s = "abcd"
Output: -1
Explanation: No character repeats so we return -1.
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T16:21:21.940Z  

```java
class Solution {
    static int repeatedCharacter(String S) {
        int res = -1;
        boolean[] visited = new boolean[256];

        for (int i = S.length() - 1; i >= 0; i--) {
            if (visited[S.charAt(i)]) {
                res = i;
            } else {
                visited[S.charAt(i)] = true;
            }
        }

        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/repeating-character-first-appearance-leftmost/1)