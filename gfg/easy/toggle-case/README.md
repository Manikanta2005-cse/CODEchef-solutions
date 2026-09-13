# Toggle Case

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**,  **convert** the characters of the string into the  **opposite case**, i.e., if a character is lowercase, then convert it into uppercase and vice versa. 

 **Examples:** 

```
Input: s = "geeksForgEeks"
Output: GEEKSfORGeEKS
Explanation: The cases of the characters in "geeksForgEeks" are flipped.
```

```
Input: s = "helloEveryOne"
Output: HELLOeVERYoNE
Explanation: The cases of the characters in "helloEveryOne" are flipped.
```

**Constraints:
**1 ≤ s.length() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:12:19.409Z  

```java
class Solution {
    public String toggleCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/toggle-case/1)