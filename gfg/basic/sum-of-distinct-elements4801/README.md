# Sum of distinct elements

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an array  **a**  **rr**. Find the sum of distinct elements in an array.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: 15
Explanation: Distinct elements are 1, 2, 3, 4, 5. So sum is 15.
```

```
Input: arr[] = [5, 5, 5, 5, 5]
Output: 5
Explanation: Only Distinct element is 5. So sum is 5.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:33:27.546Z  

```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    int findSum(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : arr) {
            
            if (set.add(num)) {
                sum += num;
            }
        }

        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-distinct-elements4801/1)