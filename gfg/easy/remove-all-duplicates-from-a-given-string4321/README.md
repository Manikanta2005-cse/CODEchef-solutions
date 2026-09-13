# String Duplicates Removal

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  which may contain lowercase and uppercase characters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

 **Examples:** 

```
Input: s = "geEksforGEeks"
Output: "geEksforG"
Explanation: After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".

```

```
Input: s = "HaPpyNewYear"
Output: "HaPpyNewYr"
Explanation: After removing duplicate characters such as e, a, we have string as "HaPpyNewYr".

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T15:56:14.564Z  

```java
class Solution {
    String removeDuplicates(String s) {
        boolean[] visited = new boolean[256];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1)