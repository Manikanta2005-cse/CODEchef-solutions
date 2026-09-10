# Check Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, you need to check if it is palindrome or not. A palidrome is a string that reads the same from front and back.

 **Note:**  Ignore the case in this question.

 **Examples:** 

```
Input: s = "Hello"
Output: false
Explanation: Hello is not equal to olleH so it's not a palindrome.
```

```
Input: s = "TenEt"
Output: true
Explanation: TenEt == tEneT as we are ignoring the case.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T15:43:50.215Z  

```java
class Solution {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-palindrome--141628/1)