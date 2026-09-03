# Check if the Sentence Is Pangram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **pangram**  is a sentence where every letter of the English alphabet appears at least once.

Given a string `sentence` containing only lowercase English letters, return `true` *if* `sentence` *is a  **pangram**, or* `false` *otherwise.* 

 

 **Example 1:** 

```
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

```

 **Example 2:** 

```
Input: sentence = "leetcode"
Output: false

```

 

 **Constraints:** 

- 1 <= sentence.length <= 1000
- sentence consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 83.67%)  
**Memory:** 42.5 MB (beats 98.05%)  
**Submitted:** 2026-09-03T15:41:24.841Z  

```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        
        int seen = 0;
        for (int i = 0; i < sentence.length(); i++) {
            seen |= (1 << (sentence.charAt(i) - 'a'));
            
            if (seen == ((1 << 26) - 1)) {
                return true;
            }
        }
        
        return seen == ((1 << 26) - 1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)