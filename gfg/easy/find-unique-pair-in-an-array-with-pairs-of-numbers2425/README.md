# Unique Pair in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  in which every element appears exactly twice except for two elements that appear only once, find those two unique elements and return them in sorted order.

 **Examples:** 

```
Input: arr[] = [2, 2, 5, 5, 6, 7]
Output: [6, 7]
Explanation: 2 and 5 appear twice, while 6 and 7 appear only once.

```

```
Input: arr[] = [1, 3, 4, 1]
Output: [3, 4]
Explanation: 1 appears twice, while 3 and 4 appear only once.
```

 **Constraints:** 
2 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T15:45:03.389Z  

```java
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findUniquePair(int[] arr) {
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }

        int rightmostSetBit = xor & -xor;

        int first = 0;
        int second = 0;
        for (int num : arr) {
            if ((num & rightmostSetBit) != 0) {
                first ^= num;
            } else {
                second ^= num;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        if (first < second) {
            result.add(first);
            result.add(second);
        } else {
            result.add(second);
            result.add(first);
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-unique-pair-in-an-array-with-pairs-of-numbers2425/1)