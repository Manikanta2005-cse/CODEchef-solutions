# Union of Two Arrays with Distinct Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two unsorted arrays **a[]**  and  **b[]**, each containing distinct elements, return an array representing the union of the two arrays in sorted order.

The union of two arrays contains all distinct elements that are present in either a[] or b[]. The resulting array should contain each element only once and be sorted in ascending order.

 **Examples:** 

```
Input: a[] = [89, 24, 75, 11, 23], b[] = [89, 2, 4]
Output: [2, 4, 11, 23, 24, 75, 89]
Explanation: All the distinct elements in both arrays.
```

```
Input: a[] = [1, 2, 3, 4, 5, 6], b[] = [3, 4, 5, 6, 7]
Output: [1, 2, 3, 4, 5, 6, 7]
Explanation: All the distinct elements in both arrays.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T14:51:06.109Z  

```java
import java.util.*;

class Solution {
    public ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set = new TreeSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            set.add(num);
        }

        return new ArrayList<>(set);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/union-of-two-arrays-with-distinct-elements/1)