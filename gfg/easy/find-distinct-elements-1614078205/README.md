# Find distinct elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array **arr[]**. Your task is to return the count of all the distinct elements in an array

 **Examples:** 

```
Input: arr[] = [2, 2, 3, 2]
Output: 2
```

```
Input: arr[] = [12, 1, 14, 3, 16]
Output: 5
```

 **Constraints:** 
1 ≤ arr.size() ≤ 100
-1000 ≤ arr[i] ≤ 1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T15:35:50.180Z  

```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    static int distinct(int arr[], int n) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-distinct-elements-1614078205/1)