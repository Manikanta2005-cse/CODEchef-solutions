# Half Ascending and Half Descending Sort

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr** of even size, sort the first half of the array in ascending order and the second half in descending order.

 **Examples :** 

```
Input: arr[] = [10, 20, 30, 40]
Output: [10, 20, 40, 30]
Explanation: 
The array is divided into two equal halves: [10, 20] and [30, 40].
The first half is already in ascending order, so it remains [10, 20].
The second half is sorted in descending order, changing [30, 40] to [40, 30].
Thus, the final array becomes [10, 20, 40, 30].

```

```
Input: arr[] = [5, 4, 6, 2, 3, 8, 9, 7]
Output: [2, 4, 5, 6, 9, 8, 7, 3] 
Explanation: 
The array is divided into two equal halves: [5, 4, 6, 2] and [3, 8, 9, 7].
Sorting the first half in ascending order gives [2, 4, 5, 6].
Sorting the second half in descending order gives [9, 8, 7, 3].
Combining both halves, the final array becomes [2, 4, 5, 6, 9, 8, 7, 3].

```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:35:41.985Z  

```java
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            result.add(arr[i]);
        }
        for (int i = n - 1; i >= mid; i--) {
            result.add(arr[i]);
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-first-half-in-ascending-and-second-half-in-descending1714/1)