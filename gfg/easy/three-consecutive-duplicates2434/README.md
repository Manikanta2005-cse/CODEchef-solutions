# Repeated Removal of 3 Consecutive Duplicates

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, repeatedly remove any group of exactly three consecutive identical characters. After each removal, concatenate the remaining parts of the string and continue removing such groups until no more removals are possible. Return the final string after all possible removals. If the resulting string is empty, return  **"-1"**.

 **Examples:** 

```
Input: s = "aabbbaccddddc"
Output: ccdc
Explanation: First remove "aaa" to obtain "bbbaccdddddc". Next remove "bbb" to obtain "accdddddc". Finally, remove "ddd" to obtain "ccddc". No more groups of three consecutive identical characters remain, so the reduced string is "ccddc".
```

```
Input: s = "aaabbbccc"
Output: -1
Explanation: Remove "aaa" to obtain "bbbccc". Next remove "bbb" to obtain "ccc". Finally, remove "ccc" to obtain an empty string. Since no characters remain, return "-1".

```

**Constraints:
**1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:18:26.509Z  

```java
import java.util.Stack;

class Solution {
    static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String reducedString(String s) {
        Stack<Pair> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek().ch == c) {
                stack.peek().count++;
                if (stack.peek().count == 3) {
                    stack.pop();
                }
            } else {
                stack.push(new Pair(c, 1));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Pair p : stack) {
            for (int i = 0; i < p.count; i++) {
                sb.append(p.ch);
            }
        }

        return sb.length() == 0 ? "-1" : sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/three-consecutive-duplicates2434/1)