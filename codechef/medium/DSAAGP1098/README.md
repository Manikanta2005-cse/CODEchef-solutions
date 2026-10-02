# DSAAGP1098

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T16:05:35.433Z  

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

[View on CodeChef](https://www.codechef.com/problems/DSAAGP1098)