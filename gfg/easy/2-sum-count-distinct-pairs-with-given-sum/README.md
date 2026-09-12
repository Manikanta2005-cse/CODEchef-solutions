# Count Distinct Pairs with Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  and an integer  **target**, return the number of distinct pairs whose sum is equal to target. Two pairs are considered the same if they contain the same two values, regardless of their order. Multiple occurrences of the same values should be counted only once.

 **Examples:** 

```
Input: arr[] = [5, 6, 5, 7, 7, 8], target = 13 
Output: 2
Explanation: Distinct pairs with sum equal to 13 are (5, 8) and (6, 7).
```

```
Input: arr[] = [1, 1, 1], target = 2
Output: 1
Explanation: Distinct pairs with sum equal to 2 is (1, 1).
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T16:15:02.424Z  

```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    static int countDistinctPairs(int arr[], int target) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> pairComplements = new HashSet<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement) && !pairComplements.contains(complement) && !pairComplements.contains(num)) {
                count++;
                pairComplements.add(complement);
                pairComplements.add(num);
            }
            seen.add(num);
        }

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/2-sum-count-distinct-pairs-with-given-sum/1)