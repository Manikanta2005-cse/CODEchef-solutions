# Alternate Lowercase and Uppercase

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, convert it into an alternating sequence of  **lowercase**  and  **uppercase**  characters while keeping the character at index  **0**  unchanged.

Return the modified string.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: gEeKsFoRgEeKs
Explanation: The first character is lowercase, so characters at even indices remain lowercase and characters at odd indices are converted to uppercase.
```

```
Input: s = "Geeksforgeeks"
Output: GeEkSfOrGeEkS
Explanation: The first character is uppercase, so characters at even indices remain uppercase and characters at odd indices are converted to lowercase.
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:49:29.099Z  

```java
class Solution {
    public String altCase(String s) {
        StringBuilder result = new StringBuilder();
        boolean isLower = Character.isLowerCase(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isLower) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
            isLower = !isLower;
        }

        return result.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/crazy-string1157/1)