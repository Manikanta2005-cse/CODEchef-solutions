# TSORT - Rating 667

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Simple Sorting

Given a list of numbers, you have to sort them in non decreasing order.

### Input Format
- The first line contains a single integer, $N$, denoting the number of integers in the list.
- The next $N$ lines contain a single integer each, denoting the elements of the list.
### Output Format

Output $N$ lines, containing one integer each, in non-decreasing order.

### Constraints
- $1 \leq N \leq 10^6$
- $0 \leq$ elements of the list $\leq 10^6$
### Sample 1:
Input
Output

```
5
5
3
6
7
1
```

```
1
3
5
6
7
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T14:45:24.140Z  

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        mergeSort(arr, 0, N - 1);
        
        for (int x : arr) {
            System.out.println(x);
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TSORT)