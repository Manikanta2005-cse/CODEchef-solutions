# Special String Reversal

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  containing alphabets and special characters, reverse the order of the alphabets in the string while keeping all special characters at their original positions.

Return the resulting string.

 **Examples :** 

```
Input: s = "A&B"
Output: "B&A"
Explanation: Reverse only the alphabets A and B, which gives B and A. Place them back in their original positions while keeping the special character & unchanged. Thus, the resulting string is "B&A".
```

```
Input: s = "A&x#"
Output: "x&A#"
Explanation: Reverse only the alphabets A and x, while keeping the special characters & and # at their original positions. Thus, the resulting string is "x&A#".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T15:58:13.881Z  

```java
class Solution {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/special-array-reversal2328/1)