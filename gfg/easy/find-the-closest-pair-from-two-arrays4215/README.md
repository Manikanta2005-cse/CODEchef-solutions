# Closest Sum Pair Across Two Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two  **sorted**  arrays arr1[] and arr2[] of size n and m and a number x, find the pair whose sum is closest to x and the pair has an element from each array. In the case of multiple closest pairs return any one of them.

 **Note**  : In the driver code, the absolute difference between the sum of the closest pair and x is printed.

 **Examples:** 

```
Input : arr1[] = [1, 4, 5, 7], arr2[] = [10, 20, 30, 40], x = 32
Output : [1, 30]
Explanation:The closest pair whose sum is closest to 32 is [1, 30] = 31.

```

```
Input : arr1[] = [1, 4, 5, 7], arr2[] = [10, 20, 30, 40], x = 50 
Output : [7, 40] 
Explanation: The closest pair whose sum is closest to 50 is [7, 40] = 47.
```

 **Constraints:** 
1 ≤ arr1.size(), arr2.size() ≤ 105
1 ≤ arr1[i], arr2[i] ≤ 109
1 ≤ x ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T14:55:25.748Z  

```java
class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        int n = arr1.length;
        int m = arr2.length;

        int left = 0;
        int right = m - 1;

        int diff = Integer.MAX_VALUE;
        int res1 = -1;
        int res2 = -1;

        while (left < n && right >= 0) {
            int sum = arr1[left] + arr2[right];

            if (Math.abs(sum - x) < diff) {
                diff = Math.abs(sum - x);
                res1 = arr1[left];
                res2 = arr2[right];
            }

            if (sum > x) {
                right--;
            } else {
                left++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(res1);
        result.add(res2);

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays4215/1)