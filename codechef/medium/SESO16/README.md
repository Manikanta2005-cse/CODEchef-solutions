# SESO16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Implement Bubble Sort

Write a C program that sorts the given array of integers using the  **Bubble sort**  algorithm.

 **Note:**  Do not write code to take input or print output, Only complete the implementation of the bubbleSort function.

### Input Format
- The first line contains an integer $N$, the number of elements in the array.
- The second line contains $N$ space-separated integers, representing the elements of the array.
### Output Format

Print the sorted array in ascending order as space-separated integers on a single line.

### Constraints
- $1 \le N \le 1000$
- $-10^9 \le \text{Array Elements} \le 10^9$
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
**Submitted:** 2026-10-17T15:19:14.956Z  

```java
public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SESO16)