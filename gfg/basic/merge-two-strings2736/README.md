# Alternate Merge Two Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two strings  **s1**  and  **s2**, merge them alternatively i.e. the first character of s1 then the first character of s2 and so on till the strings end.

 **Note:**  Add the whole string if other string is empty.

 **Examples:** 

```
Input: s1 = "Hello", s2 = "Bye"
Output: HBeylelo
Explanation: The characters of both the given strings are arranged alternatlively.

```

```
Input: s1 = "abc", s2 = "def"
Output: adbecf
Explanation: The characters of both the given strings are arranged alternatlively.

```

 **Constraints:** 
1<=|s1|, |s2| <=103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T16:40:25.279Z  

```java
class Solution {
    String merge(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        int n1 = s1.length(), n2 = s2.length();

        while (i < n1 || j < n2) {
            if (i < n1) {
                result.append(s1.charAt(i));
                i++;
            }
            if (j < n2) {
                result.append(s2.charAt(j));
                j++;
            }
        }

        return result.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-two-strings2736/1)