# Pair Sum in a Sorted and Rotated Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of positive elements   arr[]   that is  **sorted**  and then  **rotated**  around an unknown point, the task is to check if the array has a pair with sum equals to a given   target .

 **Examples:** 

```
Input: arr[] = [7, 9, 1, 3, 5], target = 6
Output: true
Explanation: arr[2] and arr[4] has sum equals to 6 which is equal to the target.

```

```
Input: arr[] = [2, 3, 4, 1], target = 3
Output: true
Explanation: arr[0] and arr[3] has sum equals to 3 which is equal to the target.

```

```
Input: arr[] = [10, 7, 4, 1], target = 9
Output: false
Explanation: There is no such pair exists in arr[] which sums to target.

```

**Constraints:
**2 <= arr.size() <=106
1 <= arr[i] <= 106
1 <= target <= 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T16:12:20.424Z  

```java
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        int n = arr.length;

        int i;
        for (i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }

        int l = (i + 1) % n; 
        int r = i; 

        while (l != r) {
            int currentSum = arr[l] + arr[r];

            if (currentSum == target) {
                return true;
            }

            if (currentSum < target) {
                l = (l + 1) % n;
            } else {
                r = (n + r - 1) % n;
            }
        }

        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pair-sum-in-a-sorted-and-rotated-array/1)