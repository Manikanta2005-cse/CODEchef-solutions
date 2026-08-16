# DPNMAO23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Unique Array

In a data processing pipeline, you've received a list of transaction IDs. However, due to a system glitch, some IDs have been logged multiple times. Your task is to clean this data by removing all duplicate IDs, ensuring that the final list contains each ID only once, while preserving the original order of the first appearance of each ID.

Write a function that takes an array of integers $A$ and removes the duplicate elements.

### Input Format
- The first line contains a single integer, $N$, representing the number of elements in the array.
- The second line contains $N$ space separated integers, representing the elements of the array.
### Output Format
- Print the elements of the array after removing duplicates, separated by a single space.
### Constraints
- $1 \leq N \leq 10^5$
- $1 \leq A_i \leq 10^9$
### Sample 1:
Input
Output

```
7
1 2 2 3 4 4 5
```

```
1 2 3 4 5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T16:04:50.450Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> uniqueElements = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int x : arr) {
            if (!seen.contains(x)) {
                uniqueElements.add(x);
                seen.add(x);
            }
        }

        for (int i = 0; i < uniqueElements.size(); i++) {
            System.out.print(uniqueElements.get(i));
            if (i != uniqueElements.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DPNMAO23)