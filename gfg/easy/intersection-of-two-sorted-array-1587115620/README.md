# Intersection of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two sorted arrays  **arr1** [] and  **arr** 2[]. Your task is to return the  **intersection** of both arrays.
Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not count duplicate elements.
Note: If there is no intersection then return an empty array.

 **Examples**  **:** 

```
Input: arr1[] = [1, 2, 3, 4], arr2[] = [2, 4, 6, 7, 8]
Output: [2, 4]
Explanation: 2 and 4 are only common elements in both the arrays.
```

```
Input: arr1[] = [1, 2, 2, 3, 4], arr2[] = [2, 2, 4, 6, 7, 8]
Output: [2, 4]
Explanation: 2 and 4 are the only common elements.
```

```
Input: arr1[] = [1, 2], arr2[] = [3, 4]
Output: []
Explanation: No common elements.
```

 **Constraints:** 
1 ≤ arr1.size(),arr2.size() ≤ 105
1 ≤ arr1[i], arr2[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T16:15:05.325Z  

```java
class Solution {
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;

        while (i < n && j < m) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-array-1587115620/1)