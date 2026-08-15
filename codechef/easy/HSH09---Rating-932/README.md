# HSH09 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Count Beautiful Pairs

You have an array $A$ of $N$ integers.
A pair of indices $(i, j)$ is called Beautiful if $A_i = A_j^2$ and $1 \leq i \lt j \leq N$.

Count the number of Beautiful Pairs in the given array.

### Task

Use the Hash Function given in the IDE to index the Hash array.

### Input Format
- The first line of the input contains a single integer $N$, denoting the length of array $A$.
- The second line of the input contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ — denoting the array $A$.
### Output Format
- $2 \leq N \leq 10^5$
- $1 \leq A_i \leq 10^9$
### Sample 1:
Input
Output

```
4
4 4 2 2
```

```
4
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:06:35.205Z  

```java
import java.util.Scanner;

public class Main {
    static final int M = 999983;
    static final int MX = 1000000000;
    static int[] Hash = new int[M];

    // Hash function handling long and negative values safely
    static int f(long x) {
        int hash = (int) (x % M);
        if (hash < 0) {
            hash += M;
        }
        return hash;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        long ans = 0; // Using long to avoid integer overflow

        for (int i = 0; i < n; i++) {
            // Check if a[i]^2 can be safely computed within bounds (-31622 to 31622)
            if (a[i] > -31623 && a[i] < 31623) {
                ans += Hash[f(a[i] * a[i])];
            }
            // Update the frequency count of the current element in the hash table
            Hash[f(a[i])]++;
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HSH09)