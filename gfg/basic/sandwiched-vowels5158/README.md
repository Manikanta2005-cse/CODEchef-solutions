# Remove Sandwiched Vowels

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given string  **s** containing only lowercase English alphabets, eliminate the vowels from the string that occur between two consonants (sandwiched between two immediately adjacent consonants). Return the new string.

 **Examples:** 

```
Input : s = "bab"
Output : bb
Explanation: 'a' is a vowel occuring between two consonants i.e. b. Hence the updated string eliminates a.
```

```
Input : s = "ceghij"
Output : cghj
Explanation: 'e' and 'i' are sandwitched vowels.
```

**Constraints:
**1 ≤ s.size() ≤ 106
'a' ≤ s[i] ≤ 'z'

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T16:00:27.305Z  

```java
class Solution {
    public String sandwichedVowel(String s) {
        int n = s.length();
        if (n <= 2) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int i = 1; i < n - 1; i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            char next = s.charAt(i + 1);

            if (isVowel(curr) && !isVowel(prev) && !isVowel(next)) {
                continue;
            }
            sb.append(curr);
        }

        sb.append(s.charAt(n - 1));
        return sb.toString();
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sandwiched-vowels5158/1)