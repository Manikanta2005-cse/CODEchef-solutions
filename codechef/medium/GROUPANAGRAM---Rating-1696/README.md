# GROUPANAGRAM - Rating 1696

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:11:09.434Z  

```java
public static int longestPalindromeLength(String s) {
    // write your code here 
    Map<Character, Integer> freq = new HashMap<>();
    for (char ch : s.toCharArray()) {
        freq.put(ch, freq.getOrDefault(ch, 0) + 1);
    }
    
    int length = 0;
    boolean oddFound = false;
    for (int count : freq.values()) {
        if (count % 2 == 0) {
            length += count;
        } else {
            length += count - 1;
            oddFound = true;
        }
    }
    if (oddFound) {
        length += 1;
    }
    return length;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/GROUPANAGRAM)