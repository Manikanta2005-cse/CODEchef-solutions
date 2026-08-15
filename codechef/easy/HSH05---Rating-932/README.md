# HSH05 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Count Beautiful Pairs

You have an array $A$ of $N$ integers.
A pair of indices $(i, j)$ is called Beautiful if $A_i = A_j^2$ and $1 \leq i \lt j \leq N$.

Count the number of Beautiful Pairs in the given array.

### Task

Try to solve this problem in $N$ time complexity with Hash array.

### Input Format
- The first line of the input contains a single integer $N$, denoting the length of array $A$.
- The second line of the input contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ — denoting the array $A$.
### Output Format
- $2 \leq N \leq 10^5$
- $1 \leq A_i \leq 10^4$
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
**Submitted:** 2026-08-15T15:59:53.933Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int MX = 10001;
        int[] Hash = new int[MX];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if ((long) a[i] * a[i] < MX) {
                ans += Hash[a[i] * a[i]];
            }
            Hash[a[i]]++;
        }

        System.out.println(ans);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HSH05)