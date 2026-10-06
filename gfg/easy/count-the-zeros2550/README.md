# Count Zeros in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array a **rr**  of only 0's and 1's. The array is **sorted**  in such a manner that all the 1's are placed first and then they are followed by all the 0's. Find the count of all the 0's.

 **Examples:** 

```
Input: arr[] = [1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0]
Output: 3
Explanation: There are 3 0's in the given array.
```

```
Input: arr[] = [0, 0, 0, 0, 0]
Output: 5
Explanation: There are 5 0's in the array.
```

 **Constraints:** 
1 <= arr.size <= 105
0 <= arr[i] <= 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T15:51:05.727Z  

```java
class Solution {
    int countZeroes(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int firstZero = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 0) {
                firstZero = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (firstZero == -1) {
            return 0;
        }

        return n - firstZero;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-the-zeros2550/1)