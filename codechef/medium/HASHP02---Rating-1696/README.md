# HASHP02 - Rating 1696

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Length of Longest Palindrome

Given a string $s$ which consists of lowercase latin letters, return the length of the  **longest palindrome**  that can be built with those letters.

### Input Format
- The first and only line of input contains the string s.
### Output Format
- Output on a single line, the length of the longest palindrome that can be format using the letters of s.
### Constraints
- $1 \leq s.length \leq 10^5$
- s consists of lowercase English letters only.
### Sample 1:
Input
Output

```
bbd
```

```
3
```

### Explanation:
- Longest palindromic string: bdb
### Sample 2:
Input
Output

```
aabdcd
```

```
5
```

### Explanation:
- Longest possible palindromic strings: adbda, adcda, dabad, dacad

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:11:03.488Z  

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

[View on CodeChef](https://www.codechef.com/problems/HASHP02)