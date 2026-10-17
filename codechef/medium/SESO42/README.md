# SESO42

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Complete the implementation

Given a insertionSort function that accepts an array as a parameter, sort the array using the  **Insertion sort**  algorithm.

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
**Submitted:** 2026-10-17T15:36:50.753Z  

```java
static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SESO42)