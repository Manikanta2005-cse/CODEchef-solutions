# Smallest Number In One Swap

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a non-negative integer represented as a string  **s**, find the smallest possible number that can be obtained by performing at most one swap of two digits. The output should not contain leading zeros.

 **Examples:** 

```
Input: s = "9625635"
Output: "2695635"
Explanation: Swapped the digits 9 and 2.
```

```
Input: s = "1205763"
Output: "1025763"
Explanation: Swapped the digits 0 and 2.
```

```
Input: s = "123"
Output: "123"
Explanation: No swapping required
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:16:16.340Z  

```java
class Solution {
    public String smallestNumber(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int[] minRight = new int[n];
        int minIdx = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }
            minRight[i] = minIdx;
        }

        for (int i = 0; i < n; i++) {
            int bestIdx = -1;

            for (int j = n - 1; j > i; j--) {
                if (i == 0 && arr[j] == '0') {
                    continue;
                }
                if (arr[j] < arr[i]) {
                    if (bestIdx == -1 || arr[j] < arr[bestIdx]) {
                        bestIdx = j;
                    }
                }
            }

            if (bestIdx != -1) {
                char temp = arr[i];
                arr[i] = arr[bestIdx];
                arr[bestIdx] = temp;
                return new String(arr);
            }
        }

        return s;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-number-in-one-swap0010/1)