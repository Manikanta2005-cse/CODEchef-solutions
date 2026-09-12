# Reverse each word in a given string

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string  **s**. You need to reverse each word in it where the words are separated by spaces and return the modified string.

Note: The string may contain leading or trailing spaces, or multiple spaces between two words. The returned string should only have a single space separating the words, and no extra spaces should be included.

 **Examples:** 

```
Input: s = " i like this program very much "
Output: "i ekil siht margorp yrev hcum"
Explanation: The words are reversed as follows:
"i" -> "i","like"->"ekil",
"this"->"siht","program" -> "margorp",
"very" -> "yrev","much" -> "hcum".
```

```
Input: s = " pqr mno "
Output: "rqp onm"
Explanation: The words are reversed as follows:
"pqr" -> "rqp",
"mno" -> "onm"

```

```
Input: s = "pqr"
Output: "rqp"
Explanation: The words are reversed as follows:
"pqr" -> "rqp"
```

 **Constraints:** 
1 <= s.size() <= 105
string `s` contains only lowercase English alphabets and spaces

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T16:34:44.782Z  

```java
class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }
            if (i >= n) break;

            int start = i;
            while (i < n && s.charAt(i) != ' ') {
                i++;
            }

            StringBuilder word = new StringBuilder(s.substring(start, i));
            word.reverse();

            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(word);
        }

        return result.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-each-word-in-a-given-string1001/1)