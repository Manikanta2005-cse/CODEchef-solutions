# Panagram Checking

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string s, check if it is a "Panagram" or not.  A "Panagram" is a sentence containing every letter in the English Alphabet either in lowercase or Uppercase.

 **Examples:** 

```
Input: s = "Bawds jog, flick quartz, vex nymph"
Output: true
Explanation: In the given string, there are all the letters of the English alphabet. Hence, the output is true.

```

```
Input: s = "sdfs"
Output: false
Explanation: In the given string, there aren't all the letters present in the English alphabet. Hence, the output is false.
```

 **Constraints:** 
1 ≤ |s| ≤ 104
The string may contain any ASCII character.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T15:42:23.840Z  

```java
class Solution {
    public static boolean checkPangram(String s) {
        if (s == null || s.length() < 26) {
            return false;
        }

        boolean[] visited = new boolean[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!visited[index]) {
                    visited[index] = true;
                    count++;
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                int index = ch - 'A';
                if (!visited[index]) {
                    visited[index] = true;
                    count++;
                }
            }

            if (count == 26) {
                return true;
            }
        }

        return count == 26;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pangram-checking-1587115620/1)