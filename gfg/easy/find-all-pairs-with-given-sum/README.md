# All Pairs With Given Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a 0-indexed array  **arr[]**  and an integer  **target**, find all pairs of indices (i, j) such that arr[i] + arr[j] = target and i < j.

Return all such index pairs sorted in lexicographical order.

 **Examples:** 

```
Input: arr[] = [10, 20, 30, 20, 10, 30], target = 50 
Output: [[1, 2], [1, 5], [2, 3], [3, 5]]
Explanation: All pairs with sum = 50 are: arr[1] + arr[2] = 20 + 30 = 50, arr[1] + arr[5] = 20 + 30 = 50, arr[2] + arr[3] = 30 + 20 = 50, arr[3] + arr[5] = 20 + 30 = 50.
```

```
Input: arr[] = [10, 20, 30, 20, 10, 30], target = 80 
Output: []
Explanation: No pairs with sum = 80.
```

**Constraints:
**1 ≤ n ≤ 103
0 ≤ arr[i] ≤  104
1 ≤ target ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T16:19:30.725Z  

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> findAllPairs(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-all-pairs-with-given-sum/1)