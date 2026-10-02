# ROTATIONARAY

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find how many times the array have been rotated

You are given an array of integers $nums$ of size $n$, which was originally sorted in ascending order with  **unique elements**. The array has been  **rotated to the right**  by an unknown number of steps (ranging from 0 to n - 1).

Your task is to  **find how many times the array has been rotated**.

### Function Declaration
### Function Name

$countRotations$ – This function returns the number of times a sorted array has been rotated.

### Parameters
- $nums$ : A reference to a rotated sorted array of unique integers.
### Return Value
- Returns an integer representing the number of right rotations applied to the array.
## Constraints
- $1 \leq n \leq 10^4$
- $-10^4 \leq nums[i] \leq 10^4$
- All elements in $nums$ are unique
- $nums$ is a rotated version of a sorted array
### Input Format
- The first line contains an integer $T$ — number of test cases.
- For each test case: One line containing an integer $n$ — size of the array One line containing $n$ space-separated integers — the rotated sorted array
### Output Format
- For each test case, print a single integer — number of rotations
### Sample 1:
Input
Output

```
3
7
7 9 12 15 2 4 5
6
10 20 30 5 7 8
5
1 2 3 4 5

```

```
4
3
0
```

### Explanation:
- For the first test case the original sorted array is [2, 4, 5, 7, 9, 12, 15]. It has been rotated 4 times to the right.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T15:33:23.682Z  

```java
class Solution {
    public int countRotations(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            if (nums[low] <= nums[high]) {
                return low;
            }

            int mid = low + (high - low) / 2;
            int next = (mid + 1) % nums.length;
            int prev = (mid - 1 + nums.length) % nums.length;

            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return mid;
            }

            if (nums[mid] >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return 0;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ROTATIONARAY)