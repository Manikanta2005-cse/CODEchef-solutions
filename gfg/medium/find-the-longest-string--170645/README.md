# Find the longest string

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of strings  **words**  **[]**. Find the  **longest**  string in words[] such that  **every prefix**  of it is also present in the array words[]. 

 **Note:** If multiple strings have the same maximum length, return the  **lexicographically smallest one**.

 **Examples:** 

```
Input: words[] = ["p", "pr", "pro", "probl", "problem", "pros", "process", "processor"]
Output: pros
Explanation: "pros" is the longest word with all prefixes ("p", "pr", "pro", "pros") present in the array words[].
```

```
Input: words[] = ["ab", "a", "abc", "abd"]
Output: abc
Explanation: Both "abc" and "abd" has all the prefixes in words[]. Since, "abc" is lexicographically smaller than "abd", so the output is "abc".

```

 **Constraints:** 
1 ≤ words.length() ≤ 103
1 ≤ words[i].length ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T16:04:46.935Z  

```java
import java.util.*;

class Solution {
    public String longestString(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String result = "";

        for (String word : words) {
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                if (word.length() > result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-longest-string--170645/1)