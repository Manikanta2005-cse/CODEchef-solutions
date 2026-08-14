# Type of array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an array  **arr[]** having unique elements. Your task is to return the type of array described below.

- Return 1 if the array is in ascending order. 
- Return 2 if the array is in descending order
- Return 3 if the array is in descending rotated order
- Return 4 if the array is in ascending rotated order

You may assume that the input array is always one of the four types.

 **Examples:** 

```
Input: arr[] = [2, 1, 5, 4, 3]
Output: 3
Explanation: Descending rotated, rotate 2 times left.
```

```
Input: arr[] = [3, 4, 5, 1, 2]
Output: 4
Explanation: Ascending rotated, rotate 2 times right. 
```

 **Constraints:** 
3 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:31:08.569Z  

```java
class Solution {
    int typeOfArr(int arr[]) {
        int n = arr.length;

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        if (arr[0] == min && arr[n - 1] == max) {
            return 1;
        }
        if (arr[0] == max && arr[n - 1] == min) {
            return 2;
        }
        if (arr[0] < arr[n - 1]) {
            return 3;
        }
        return 4;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/type-of-array4605/1)