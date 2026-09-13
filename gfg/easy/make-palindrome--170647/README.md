# Make Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of strings arr[] of size n, where every string has the same length. Find if it is possible to rearrange the strings and concatenate them to form a palindrome.

 **Examples :** 

```
Input: arr = ["jfh", "adt", "hfj", "tda"]
Output: true
Explanation: Make the string "jfhadttdahfj", by concatenating the given strings which is a palindrome.

```

```
Input: arr = ["jhjdf", "sftas", "fgsdf"]
Output: false
Explanation: No permutation of the given strings results in a palindromic string after concatenation.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:01:49.319Z  

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static boolean makePalindrome(String[] arr) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int oddCount = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String s = entry.getKey();
            int count = entry.getValue();

            String rev = new StringBuilder(s).reverse().toString();

            if (s.equals(rev)) {
                if (count % 2 != 0) {
                    oddCount++;
                }
            } else {
                int revCount = map.getOrDefault(rev, 0);
                if (count != revCount) {
                    return false;
                }
            }
        }

        return oddCount <= 1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/make-palindrome--170647/1)