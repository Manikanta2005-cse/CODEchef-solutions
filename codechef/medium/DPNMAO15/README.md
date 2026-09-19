# DPNMAO15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Merge Sorted Arrays

Two rival e-commerce platforms have decided to merge. For a specific category, each platform provides a list of its product IDs, which are already sorted in ascending order.
Your task is to combine these two lists into a single, sorted list of product IDs to create a unified catalog.

### Input Format
- The first line contains two space separated integers, $N$ and $M$, representing the number of elements in the first and second arrays, respectively.
- The second line contains $N$ space separated integers, representing the elements of the first array.
- The third line contains $M$ space separated integers, representing the elements of the second array.
### Output Format
- Print the merged and sorted list of integers, with each element separated by a space.
### Constraints
- $1 \leq N, M \leq 10^5$
### Sample 1:
Input
Output

```
5 5
1 2 3 4 5
2 4 6 8 10
```

```
1 2 2 3 4 4 5 6 8 10
```

### Sample 2:
Input
Output

```
4 6
10 20 30 40
5 15 25 35 45 55
```

```
5 10 15 20 25 30 35 40 45 55
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T16:38:52.921Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged_arr = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged_arr[k++] = arr1[i++];
            } else {
                merged_arr[k++] = arr2[j++];
            }
        }

        while (i < n) {
            merged_arr[k++] = arr1[i++];
        }
        while (j < m) {
            merged_arr[k++] = arr2[j++];
        }

        for (int l = 0; l < n + m; l++) {
            System.out.print(merged_arr[l]);
            if (l != n + m - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DPNMAO15)