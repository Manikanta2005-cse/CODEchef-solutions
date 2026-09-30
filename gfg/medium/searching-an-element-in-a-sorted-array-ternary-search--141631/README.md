# Ternary Search

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

**Ternary search**  is a divide-and-conquer algorithm that divides the search range into three parts and identifies the part that may contain the target element. The process is repeated until the element is found or the search range becomes empty. 

Given a sorted array arr and an integer x, determine whether x is present in the array using ternary search.

 **Examples:** 

```
Input: arr = [1, 2, 3, 4, 6], x = 6
Output: true
Explanation: The element 6 is present in the array, so the output is true.
```

```
Input: arr = [1, 3, 4, 5, 6], x = 2
Output: false
Explanation: The element 2 is not present in the array, so the output is false.

```

**Constraints:
**1 ≤ arr.size() ≤ 106
1 ≤ x ≤ 106
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T16:12:34.834Z  

```java
class Solution {
    public boolean ternarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            if (arr[mid1] == x) {
                return true;
            }
            if (arr[mid2] == x) {
                return true;
            }

            if (x < arr[mid1]) {
                high = mid1 - 1;
            } else if (x > arr[mid2]) {
                low = mid2 + 1;
            } else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }

        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/searching-an-element-in-a-sorted-array-ternary-search--141631/1)