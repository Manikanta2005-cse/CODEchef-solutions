# DAA011 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Merging two sorted arrays

Let's see how the "Merge" part of Merge Sort works.
We will try to merge two already sorted arrays into a third array, which is the union of the first two and is sorted as well.

Say, we have two arrays $A$ and $B$, both are sorted and we have to merge them.

The algorithm for merging is,

- Maintain two indexes, one ($idx1$) for array $A$ and another ($idx2$) for array $B$, and initialise them to the start of both arrays, i.e., 0.
- Now, say if $A_{idx1}$ is smaller than $B_{idx2}$ we push $A_{idx1}$ into the resultant array and increment $idx1$, otherwise we will do the same with $idx2$.
- We will repeat this process until either of the indexes reaches the end of the array.

At most one index might still not reach the end of the array, even after applying these operations. We will push all the remaining contents of this array into our resultant array.

### Task

Complete the implementation of the merge function, which takes in two sorted arrays and returns a merged sorted array from these two arrays.

### Sample 1:
Input
Output

```
4
1 5 7 10
3
4 15 20

```

```
1 4 5 7 10 15 20
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T16:37:35.186Z  

```java
import java.util.*;

public class Main {

    // Merge array a and b into array c
    static void merge(int[] a, int size_a, int[] b, int size_b, int[] c) {
        // Replace '_' to solve the problem
        int idx1 = 0, idx2 = 0;
        int idx = 0;

        while (idx1 < size_a && idx2 < size_b) {
            if (a[idx1] < b[idx2]) {
                c[idx++] = a[idx1++];
            } else {
                c[idx++] = b[idx2++];
            }
        }

        while (idx1 < size_a) {
            c[idx++] = a[idx1++];
        }

        while (idx2 < size_b) {
            c[idx++] = b[idx2++];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        int[] c = new int[n + m];
        merge(a, n, b, m, c);

        for (int i = 0; i < n + m; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DAA011)