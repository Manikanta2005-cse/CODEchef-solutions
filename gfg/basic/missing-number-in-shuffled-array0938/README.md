# Missing in Another Shuffled Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr1**. The contents of arr are copied into another array  **arr2**  and numbers are shuffled. Also, one element is removed from arr2. The task is to find the missing element.

 **Examples:** 

```
Input: arr1[] = [4, 8, 1, 3, 7] and arr2[] = [7, 4, 3, 1]
Output: 8
Explanation: 8 is the only element missing from arr2.

```

```
Input: arr1[] = [12, 10, 15, 23, 11, 30] and arr2[] = [15, 12, 23, 11, 30]
Output: 10
Explanation: 10 is the only element missing from arr2.
```

 **Constraints:** 
2 <= arr1.size() <= 106
arr2.size() = arr1.size() - 1
1 <= arr1[i] <= 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:39:49.337Z  

```java
import java.util.HashMap;

class Solution {
    public int findMissing(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            map.put(num, map.get(num) - 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > 0) {
                return key;
            }
        }

        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/missing-number-in-shuffled-array0938/1)