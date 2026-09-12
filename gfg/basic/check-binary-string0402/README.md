# Check for 0 Between 1's in Binary String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a binary string  **s**  consisting of '0' and '1', determine whether it is valid such that no '0' appears between two '1's.

Return  **true**  if valid, otherwise return  **false**.

 **Examples:** 

```
Input: s = "100"
Output: true
Explanation: The string contains only one '1', so no `'0' appears between two '1's', hence it is valid.

```

```
Input: s = "1110001"
Output: false
Explanation: The string has '0' occurring between '1's, so it is not valid.

```

 **Constraints:** 
1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:45:49.802Z  

```java
class Solution {
    public boolean checkBinary(String s) {
        int firstOne = s.indexOf('1');
        int lastOne = s.lastIndexOf('1');

        if (firstOne == -1) {
            return true;
        }

        for (int i = firstOne; i <= lastOne; i++) {
            if (s.charAt(i) == '0') {
                return false;
            }
        }

        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-binary-string0402/1)