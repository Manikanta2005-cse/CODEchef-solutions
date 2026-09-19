# Count Sum Pairs in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer  **target**  and an array  **arr[]**. You need to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.

 **Note:**   Pairs should have elements of distinct indexes. 

 **Examples :** 

```
Input: arr[] = [-1, 1, 5, 5, 7], target = 6
Output: 3
Explanation: There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.

```

```
Input: arr[] = [1, 1, 1, 1], target = 2
Output: 6
Explanation: There are 6 pairs which sum up to 2 : {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} and {1, 1}.
```

```
Input: arr[] = [-1, 10, 10, 12, 15], target = 125
Output: 0
Explanation: There is no such pair which sums up to 125.
```

 **Constraints:** 
-105 <= target <=105
 2 <= arr.size() <= 105
-105 <= arr[i] <= 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T16:15:07.423Z  

```java
class Solution {
    int countPairs(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                int leftVal = arr[left];
                int rightVal = arr[right];

                if (leftVal == rightVal) {
                    int n = right - left + 1;
                    count += (n * (n - 1)) / 2;
                    break;
                }

                int leftCount = 0;
                while (left <= right && arr[left] == leftVal) {
                    leftCount++;
                    left++;
                }

                int rightCount = 0;
                while (left <= right && arr[right] == rightVal) {
                    rightCount++;
                    right--;
                }

                count += leftCount * rightCount;
            }
        }

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1)