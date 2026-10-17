# SESO41

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Complete the implementation

Given a selectionSort function that accepts an array as a parameter, sort the array using the  **Selection sort**  algorithm.

### Sample 1:
Input
Output

```
8
6 5 3 1 8 7 2 4
```

```
1 2 3 4 5 6 7 8
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T15:28:52.623Z  

```java
public static void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        if (minIndex != i) {
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SESO41)