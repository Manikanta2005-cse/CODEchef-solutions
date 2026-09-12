# Count Distinct Vowels in String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s,**  count the total  **distinct** vowels in the string. The string s contains  **lowercase** letters only.

 **Examples:** 

```
Input: s = geeksforgeeks
Output: 2
Explanation: String "geeksforgeeks" has 2 distinct vowel "e" and "o".
```

```
Input: s = world
Output: 1
Explanation: It has only 1 distinct vowel "o".
```

 **Constraints:** 
1 ≤ |s| ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:50:48.599Z  

```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels.add(c);
            }
        }
        return vowels.size();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-distinct-vowels-in-string/1)