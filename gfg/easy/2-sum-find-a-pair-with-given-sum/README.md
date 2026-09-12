# 2 Sum - Find a pair with given sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array arr[] and an integer target, return the pair of elements whose sum equals target. An element cannot be used twice unless it appears multiple times in the array.

 **Note:**   If no pair exist, return an empty array.

 **Examples:** 

```
Input: arr[] = [2, 9, 10, 4, 15], target = 12
Output: [2, 10]
Explanation: Pair with sum equal to 12 is (2, 10).
```

```
Input: arr[] = [3, 2, 4], target = 8
Output: []
Explanation: No pair exists with sum equal to 8.
```

```
Input: arr[] = [1, 4, 5, 6, 1], target = 2
Output: [1, 1]
Explanation: Pair with sum equal to 2 is (1, 1).
```

**Constraints:
**1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 104
1 ≤ target ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T16:09:54.051Z  

```java
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> twoSum(int[] arr, int target) {
        int n = arr.length;
        int[][] numWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            numWithIndex[i][0] = arr[i];
            numWithIndex[i][1] = i;
        }

        Arrays.sort(numWithIndex, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = numWithIndex[left][0] + numWithIndex[right][0];
            if (sum == target) {
                return Arrays.asList(numWithIndex[left][0], numWithIndex[right][0]);
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new ArrayList<>();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/2-sum-find-a-pair-with-given-sum/1)