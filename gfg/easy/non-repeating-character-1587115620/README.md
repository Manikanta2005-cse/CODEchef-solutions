# Non Repeating Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  consisting of  **lowercase** English Letters. return the first non-repeating character in  **s**. If there is no non-repeating character, return  **'$'**.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.
```

```
Input: s = "racecar"
Output: 'e'
Explanation: In the given string, 'e' is the only character in the string which does not repeat.
```

```
Input: s = "aabbccc"
Output: '$'
Explanation: All the characters in the given string are repeating.
```

 **Constraints:** 
1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T16:41:57.220Z  

```java
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public char nonRepeatingChar(String s) {
        Set<Character> nonRepeating = new LinkedHashSet<>();
        Set<Character> repeating = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (repeating.contains(ch)) {
                continue;
            }
            if (nonRepeating.contains(ch)) {
                nonRepeating.remove(ch);
                repeating.add(ch);
            } else {
                
                nonRepeating.add(ch);
            }
        }
        if (!nonRepeating.isEmpty()) {
            return nonRepeating.iterator().next();
        }

        return '$';
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1)