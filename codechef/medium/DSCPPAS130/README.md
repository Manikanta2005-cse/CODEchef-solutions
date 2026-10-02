# DSCPPAS130

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find Number of Occurrences

You are given a sorted array containing $N$ integers and a number $target$. Complete the given function to find the number of occurrences of target in the given array.

 ***Note: You need to solve this problem in O(log(n)) complexity.** *

### Input Format
- The first line contains an integer n (1 <= n <= 10^5), the size of the array.
- The second line contains n space-separated integers representing the sorted array elements.
- The third line contains an integer target for which the occurrences need to be found.
### Output Format
- Return the number of occurrences of the target value in the array.
### Sample 1:
Input
Output

```
8
1 2 3 5 5 5 7 8
5
```

```
3
```

### Explanation:
- In this case, the target is 5, and the array is {1, 2, 3, 5, 5, 5, 7, 8}. The number of occurrences of 5 is 3.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T16:05:25.098Z  

```java
public static int countOccurrences(int[] arr, int n, int target) {
    int first = findBound(arr, n, target, true);
    if (first == -1) {
        return 0;
    }
    int last = findBound(arr, n, target, false);
    return last - first + 1;
}

private static int findBound(int[] arr, int n, int target, boolean isFirst) {
    int low = 0, high = n - 1;
    int result = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            result = mid;
            if (isFirst) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return result;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSCPPAS130)