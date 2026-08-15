# Find unique element

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr** [] and an integer  **k**. Every element in the array appears a number of times that is a multiple of k, except for one element whose frequency is not a multiple of k. Find and return that unique element.

 **Examples:** 

```
Input: arr[] = [6, 2, 5, 2, 2, 6, 6], k = 3
Output: 5
Explanation: Every element appears 3 times except 5.
```

```
Input: arr[] = [2, 2, 2, 10, 2], k = 4
Output: 10
Explanation: Every element appears 4 times except 10.
```

 **Constraints:** 
3 ≤ |arr| ≤ 2*105
2 ≤  k ≤ 2*105
1 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T15:38:01.580Z  

```java
class Solution {
    public int uniqueElement(int[] arr, int k) {
        int[] bitCounts = new int[32];

        for (int num : arr) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCounts[i]++;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bitCounts[i] % k != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-unique-element2632/1)