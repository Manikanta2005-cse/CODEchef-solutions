# Remove and Reverse

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **S** which consists of only lowercase English alphabets, you have to perform the below operations:
If the string  **S**  contains any repeating character, remove the first repeating character and reverse the string and again perform the above operation on the modified string, otherwise, you stop.
You have to find the final string.

 **Example 1:** 

```
Input: S = "abab"
Output: ba
Explanation:
In 1st operation: The first repeating 
character is a. After Removing the first 
character, S = "bab". After Reversing the 
string, S = "bab".
In 2nd operation: The first repeating 
character is b. After Removing the first 
character, S = "ab". After Reversing the 
string, S = "ba".
Now the string S does not contain any 
repeating character.
```

 **Example 2:** 

```
Input: S = "dddd"
Output: d
Explanation:
In 1st operation: The first repeating character 
is d. After Removing the first character, 
S = "ddd". After Reversing the string, S = "ddd". 
In 2nd operation: Similarly, S="dd".
In 3rd operation: Similarly, S="d".
Now the string S does not contain any repeating character.

```

 **Your Task:** 
You don't need to read input or print anything. Your task is to complete the function  **removeReverse()**  which accepts a string  **S**  input parameter and returns the modified string.

 **Expected Time Complexity:**  O(|S|)
 **Expected Auxiliary Space:**  O(K), K <= 26.

 **Constraints:** 
The string contains only lowercase English alphabets.
1 < |S| < 105
|S| denotes the length of the string S.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T15:29:29.659Z  

```java
import java.util.*;

class Solution {
    String removeReverse(String S) {
        int[] freq = new int[26];
        for (int i = 0; i < S.length(); i++) {
            freq[S.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = S.length() - 1;
        boolean dir = true;
        int removeCount = 0;
        char[] sArr = S.toCharArray();

        while (left <= right) {
            if (dir) {
                char ch = sArr[left];
                if (freq[ch - 'a'] > 1) {
                    freq[ch - 'a']--;
                    sArr[left] = '#';
                    dir = !dir;
                    removeCount++;
                }
                left++;
            } else {
                char ch = sArr[right];
                if (freq[ch - 'a'] > 1) {
                    freq[ch - 'a']--;
                    sArr[right] = '#';
                    dir = !dir;
                    removeCount++;
                }
                right--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : sArr) {
            if (ch != '#') {
                sb.append(ch);
            }
        }

        if (removeCount % 2 != 0) {
            sb.reverse();
        }

        return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-and-reverse--170634/1)