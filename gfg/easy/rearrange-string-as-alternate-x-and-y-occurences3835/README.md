# Make x times 0's and y times 1's

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary string  **s**  and two integers  **x**  and  **y**. Arrange the given string in such a way so that '0' comes x-times then '1' comes y-times and so on until one of the '0' or '1' is finished. Then concatenate the rest of the string and find the final string.

 **Examples :** 

```
Input: x = 1, y = 1, s = "0011"
Output: "0101"
Explanation: we put 1 '0' and 1 '1' alternatively.

```

```
Input: x = 1, y = 1, s = "1011011"
Output: "0101111"
Explanation: We put '0' and '1' alternatively and in last we have to put all '1' as there is no '0' left.

```

 **Constraints:** 
1 ≤ x, y ≤ 103
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:17:45.551Z  

```java
class Solution {
    public String arrangeString(String s, int x, int y) {
        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
        }

        StringBuilder sb = new StringBuilder();

        while (count0 > 0 && count1 > 0) {
            int take0 = Math.min(x, count0);
            for (int i = 0; i < take0; i++) {
                sb.append('0');
            }
            count0 -= take0;

            int take1 = Math.min(y, count1);
            for (int i = 0; i < take1; i++) {
                sb.append('1');
            }
            count1 -= take1;
        }

        while (count0 > 0) {
            sb.append('0');
            count0--;
        }

        while (count1 > 0) {
            sb.append('1');
            count1--;
        }

        return sb.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rearrange-string-as-alternate-x-and-y-occurences3835/1)