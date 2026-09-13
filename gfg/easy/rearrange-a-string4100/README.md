# Sum of Digits in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  containing uppercase alphabets and integer digits (from 0 to 9), return  **s** with the alphabets in lexicographical order followed by the sum of digits.

 **Examples:** 

```
Input: s = "AC2BEW3"
Output: "ABCEW5"
Explanation: 2 + 3 = 5 and we print all alphabets in the lexicographical order. 

```

```
Input: s = "ACCBA10D2EW30"
Output: "AABCCDEW6"
Explanation: 0+1+2+3 = 6 and we print all alphabets in the lexicographical order. 
```

 **Constraints:** 
1 ≤ |s| ≤ 105
s contains only upper case alphabets and digits.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:04:03.219Z  

```java
class Solution {
    public String arrangeString(String s) {
        int[] charCount = new int[26];
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sum += ch - '0';
            } else if (Character.isUpperCase(ch)) {
                charCount[ch - 'A']++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (charCount[i] > 0) {
                sb.append((char) ('A' + i));
                charCount[i]--;
            }
        }

        if (sum > 0) {
            sb.append(sum);
        }

        return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rearrange-a-string4100/1)