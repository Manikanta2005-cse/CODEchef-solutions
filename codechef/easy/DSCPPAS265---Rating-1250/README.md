# DSCPPAS265 - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Array Reordering

You are given two arrays $A$ and $B$ of size $N$. Given a function $F$ such that. $F(i,j) = A_i + B_j$ Reorder the arrays $A$ and $B$ such that $F(i,j) \geq F(j,i)$, $1 \leq i \leq N, 1 \leq j \leq N, i \lt j$.

### Input Format
- The first line of the input contains a single integer $T$ - the number of test cases. The description of $T$ test cases follows.
- Each test case will contain three lines of input.
- The first line of each test case contains a single integer $N$.
- The second line of each test case contains $N$ integers, $A_1, A_2... A_N$.
- The third line of each test case contains $N$ integers, $B_1, B_2... B_N$.
### Output Format
- In the first line of output, print the rearranged array $A$.
- In the first line of output, print the rearranged array $B$.
### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- $1 \leq A_i, B_i \leq 10^9$
- It is guaranteed that the sum of $N$ over all test cases is less than or equal to $2*10^5$.
### Subtasks
- 20 points : The sum of $N$ over all the testcases is less than or equal to $10$.
- 40 points : The sum of $N$ over all the testcases is less than or equal to $2*10^3$.
- 40 points : ORIGINAL CONSTRAINTS
### Sample 1:
Input
Output

```
1
4
3 8 1 5
2 1 6 4

```

```
8 5 3 1 
1 2 4 6 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T15:07:22.477Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            long[] a = new long[n];
            Integer[] idxA = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                idxA[i] = i;
            }
            
            long[] b = new long[n];
            Integer[] idxB = new Integer[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
                idxB[i] = i;
            }
            
            Arrays.sort(idxA, (i, j) -> Long.compare(a[i], a[j]));
            Arrays.sort(idxB, (i, j) -> Long.compare(b[i], b[j]));
            
            long[] resA = new long[n];
            long[] resB = new long[n];
            
            for (int i = 0; i < n; i++) {
                resA[idxA[i]] = a[idxA[i]];
                resB[idxB[n - 1 - i]] = b[idxB[n - 1 - i]];
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(resA[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
            
            for (int i = 0; i < n; i++) {
                System.out.print(resB[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSCPPAS265)