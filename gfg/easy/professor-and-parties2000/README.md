# Check if all array elements are distinct

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of size  **n**, check whether all elements in the array are distinct or not. Return true if all elements are distinct, otherwise return false.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 7]
Output: true
Explanation: All elements are unique, so no duplicates exist.
```

```
Input: arr[] = [1, 3, 2, 4, 5, 1]
Output: false
Explanation: Element 1 appears more than once, so all elements are not distinct.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T15:34:31.385Z  

```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isDistinct(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return true;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/professor-and-parties2000/1)