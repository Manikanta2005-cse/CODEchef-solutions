# Encrypt the string - 2

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string  **S**. Every sub-string of identical letters is replaced by a single instance of that letter followed by the hexadecimal representation of the number of occurrences of that letter. Then, the string thus obtained is further encrypted by reversing it [ See the sample for more clarity ]. Print the Encrypted String.

 **Note:** All Hexadecimal letters should be converted to Lowercase letters.

 

 **Example 1:** 

```
Input:
S = "aaaaaaaaaaa"
Output:
ba 
Explanation: 
aaaaaaaaaaa
Step1: a11 (a occurs 11 times)
Step2: a11 is ab [since 11 is b in
hexadecimal]
Step3: ba [After reversing]
```

 **Example 2:** 

```
Input:
S = "abc"
Output:
1c1b1a
Explanation: 
abc
Step1: a1b1c1
Step2: 1c1b1a [After reversing]
```

 

 **Your Task:** 
You don't need to read input or print anything. Your task is to complete the function  **encryptString()**  which takes a String S and returns the answer.

 

 **Expected Time Complexity:**  O(|S|)
 **Expected Auxiliary Space:**  O(1)

 **Constraints** 
1 <= |S| <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T16:03:15.725Z  

```java
class Solution {
    static String encryptString(String S) {
        StringBuilder ans = new StringBuilder();
        int n = S.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            count++;
            if (i == n - 1 || S.charAt(i) != S.charAt(i + 1)) {
                ans.append(S.charAt(i));
                String hex = Integer.toHexString(count);
                for (int j = hex.length() - 1; j >= 0; j--) {
                    ans.append(hex.charAt(j));
                }
                count = 0;
            }
        }

        return ans.reverse().toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/encrypt-the-string-21117/1)