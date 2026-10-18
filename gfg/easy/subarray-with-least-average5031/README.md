# K Sized Subarray with Minimum Average

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array  **arr[]**  and an integer  **k**, find the contiguous subarray of size  **k**  that has the minimum average value among all possible subarrays of size k. Return position (or index + 1) of the first element of that subarray.

 **Examples :** 

```
Input: arr[] = [30, 20, 10], k = 1
Output: 3
Explanation: Subarrays of length 1 are {30}, {20}, {10}. {10} has the least average equal to 10.

```

```
Input: arr[] = [30, 20, 10], k = 2
Output: 2
Explanation: Subarrays of length 2 are {30, 20}, {20, 10}. {20, 10} has the least average equal to (20 + 10)/2 = 15.
```

 **Constraints:** 
1 ≤ k ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T15:34:59.358Z  

```java
class Solution {
    public int leastAvg(int[] arr, int k) {
        int n = arr.length;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int minSum = currentSum;
        int minIndex = 0;

        for (int i = k; i < n; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];
            if (currentSum < minSum) {
                minSum = currentSum;
                minIndex = i - k + 1;
            }
        }

        return minIndex + 1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/subarray-with-least-average5031/1)