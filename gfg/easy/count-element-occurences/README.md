# Count Frequent Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of  **n**  integers and an integer  **k**, find the count of elements that appear more than  **n/k**  times in the array.

 **Examples :** 

```
Input: arr[] = [3, 1, 2, 2, 1, 2, 3, 3], k = 4
Output: 2
Explanation: The elements 2 and 3 each occur 3 times, which is more than n/k = 2.

```

```
Input: arr = [2, 3, 3, 2], k = 3
Output: 2
Explanation: Both 2 and 3 appear 2 times in the array, which is more than n/k.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T16:10:21.915Z  

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countOccurence(int[] arr, int k) {
        int n = arr.length;
        int target = n / k;

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int freq : freqMap.values()) {
            if (freq > target) {
                count++;
            }
        }

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-element-occurences/1)