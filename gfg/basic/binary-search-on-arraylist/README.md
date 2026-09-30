# Binary Search on ArrayList

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a sorted integer arrayList and an integer element  **k**. The task is to check if the element is present in the arrayList or not and return the index. 

 **Examples :** 

```
Input: list[] = [1, 2, 3, 4, 6], k = 6
Output: 4
Explanation: Since, 6 is present in the list at index 4 (0-based indexing), so output is 4.

```

```
Input: list[] = [1, 3, 4, 5, 6], k = 2
Output: -1
Explanation: Since, 2 is not present in the list, so output is -1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T16:06:06.011Z  

```java
class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = list.get(mid);

            if (midVal == k) {
                return mid;
            } else if (midVal < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/binary-search-on-arraylist/1)