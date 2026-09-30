# Earliest Last Occurrence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array  **arr[],**  that may contain duplicate elements, find the element whose last occurrence appears first in the array.

For every distinct element, determine the index of its last occurrence in the array. Return the element whose last occurrence has the smallest index.

 **Examples:** 

```
Input : arr[] = [10, 30, 20, 10, 20]
Output : 30
Explanation: The last occurrence of 30 is at index 1, while the last occurrences of 10 and 20 are at indices 3 and 4, respectively. Since the last occurrence of 30 appears earliest among all distinct elements, the answer is 30.
```

```
Input : arr[] = [5, 1, 2, 5, 1, 3]
Output : 2
Explanation:  The last occurrences of 5, 1, 2, and 3 are at indices 3, 4, 2, and 5, respectively. Among these, index 2 is the smallest, which corresponds to element 2. Therefore, the answer is 2.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:54:56.623Z  

```java
class Solution {
    public int earliestLastOcc(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            boolean foundRight = false;
            for (int i = arr.length - 1; i > left; i--) {
                if (arr[i] == arr[left]) {
                    foundRight = true;
                    break;
                }
            }

            if (!foundRight) {
                return arr[left];
            }

            left++;
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/last-seen-array-element1501/1)