# Intersection of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two  **sorted**  arrays  **a[]**  and  **b[]**, where each array may contain duplicate elements, return the elements in the  **intersection**  of the two arrays in  **sorted**  order.

 **Note:**  Intersection of two arrays can be defined as the set containing distinct common elements that are present in both of the arrays.

 **Examples:** 

```
Input: a[] = [1, 1, 2, 2, 2, 4], b[] = [2, 2, 4, 4]
Output: [2, 4]
Explanation: Distinct common elements in both the arrays are: 2 and 4.
```

```
Input: a[] = [1, 2], b[] = [3, 4]
Output: []
Explanation: No common elements.
```

```
Input: a[] = [1, 2, 3], b[] = [1, 2, 3]
Output: [1, 2, 3]
Explanation: All elements are common.
```

 **Constraints:** 
1 ≤ a.size(), b.size() ≤ 105
-109 ≤ a[i], b[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T16:29:16.923Z  

```java
class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length, m = b.length;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-arrays-with-duplicate-elements/1)