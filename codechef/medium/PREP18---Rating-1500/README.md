# PREP18 - Rating 1500

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find Array Min

You're given three non-decreasing arrays $A$, $B$, $C$ of length $N_A$, $N_B$, $N_C$. We define,

$f(i, j, k) = \max{(|A_i - B_j|, |B_j - C_k|, |A_i - C_k|)}$ where $1 \leq i \leq N_A, 1 \leq j \leq N_B, 1 \leq k \leq N_C$

Find the  **minimum**  possible value of $f(i, j, k)$ over all possible value of $i$, $j$, $k$.

Note: Array $A$ being non-decreasing means that $A_1 \leq A_2 \leq \dots \leq A_N$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first line of each test case contains three space-separated integers $N_A$, $N_B$, $N_C$ — the number of elements in the array $A$, $B$, $C$.
- The second line of each test case contains $N_A$ space-separated integers $A_1,A_2,\ldots,A_{N_A}$ — the elements of array $A$.
- The third line of each test case contains $N_B$ space-separated integers $B_1,B_2,\ldots,B_{N_B}$ — the elements of array $B$.
- The fourth line of each test case contains $N_C$ space-separated integers $C_1,C_2,\ldots,C_{N_C}$ — the elements of array $C$.
### Output Format

For each test case, output on a new line the  **minimum**  possible value of $f(i, j, k)$.

### Constraints
- $1 \leq T \leq 10$
- $1 \leq N_A, N_B, N_C \leq 10^5$
- $1 \leq A_i, B_i, C_i \leq 10^9$
### Sample 1:
Input
Output

```
3
4 2 2
2 5 10 15
4 4
10 15
1 1 1
5 
10
25
6 6 2
4 8 10 15 15 20
6 15 25 28 28 45 
10 15

```

```
6
20
0

```

### Explanation:

 **Test case $1$** : Minimum value will be $f(3, 1, 1) = \max{(|10 - 4|, |4 - 10|, |10 - 10|)} = 6$.

 **Test case $2$** : Minimum value will be $f(1, 1, 1) = \max{(|5 - 10|, |10 - 25|, |25 - 5|)} = 20$.

 **Test case $3$** : Minimum value will be $f(4, 2, 2) = \max{(|15 - 15|, |15 - 15|, |15 - 15|)} = 0$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T15:05:44.838Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        
        int t = Integer.parseInt(line.trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int na = Integer.parseInt(st.nextToken());
            int nb = Integer.parseInt(st.nextToken());
            int nc = Integer.parseInt(st.nextToken());

            long[] a = new long[na];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < na; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            long[] b = new long[nb];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < nb; i++) {
                b[i] = Long.parseLong(st.nextToken());
            }

            long[] c = new long[nc];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < nc; i++) {
                c[i] = Long.parseLong(st.nextToken());
            }

            int i = 0, j = 0, k = 0;
            long minDiff = Long.MAX_VALUE;

            while (i < na && j < nb && k < nc) {
                long maxVal = Math.max(a[i], Math.max(b[j], c[k]));
                long minVal = Math.min(a[i], Math.min(b[j], c[k]));

                minDiff = Math.min(minDiff, maxVal - minVal);

                if (minVal == a[i]) {
                    i++;
                } else if (minVal == b[j]) {
                    j++;
                } else {
                    k++;
                }
            }

            System.out.println(minDiff);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PREP18)