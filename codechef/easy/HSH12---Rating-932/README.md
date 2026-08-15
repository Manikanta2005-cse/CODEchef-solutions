# HSH12 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Count Beautiful Pairs

You have an array $A$ of $N$ integers.
A pair of indices $(i, j)$ is called Beautiful if $A_i = A_j^2$ and $1 \leq i \lt j \leq N$.

Count the number of Beautiful Pairs in the given array.

### Task

Use the built-in hashing data structure to solve this task.

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
**Submitted:** 2026-08-15T16:08:40.691Z  

```java
import java.io.*;
import java.util.*;

public class Main {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String nStr = sc.next();
        if (nStr == null) return;
        
        int N = Integer.parseInt(nStr);
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> counts = new HashMap<>();
        long ans = 0;

        for (int i = 0; i < N; i++) {
            int val = A[i];
            
            if (val < 31623) {
                int sq = val * val;
                if (counts.containsKey(sq)) {
                    ans += counts.get(sq);
                }
            }
            counts.put(val, counts.getOrDefault(val, 0) + 1);
        }

        System.out.println(ans);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HSH12)