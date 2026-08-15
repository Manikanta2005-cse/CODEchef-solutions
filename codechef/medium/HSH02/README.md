# HSH02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Count Beautiful Pairs

You have an array $A$ of $N$ integers.
A pair of indices $(i, j)$ is called Beautiful if $A_i = A_j^2$ and $1 \leq i \lt j \leq N$.

Count the number of Beautiful Pairs in the given array.

### Task

Try to solve this problem in $N^2$ time complexity.

### Input Format
- The first line of the input contains a single integer $N$, denoting the length of array $A$.
- The second line of the input contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ — denoting the array $A$.
### Output Format

Output the number of Beautiful Pairs in the given array $A$.

### Constraints
- $2 \leq N \leq 10^3$
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

### Sample 2:
Input
Output

```
3
1 2 2 
```

```
0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T15:57:27.385Z  

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        Map<Long, Long> freqMap = new HashMap<>();
        long count = 0;
        
        // Iterate over each element treating it as A_j
        for (int j = 0; j < n; j++) {
            long val = a[j];
            long square = val * val; // Target A_i value
            
            // Check if A_i = A_j^2 appeared at an earlier index (i < j)
            if (freqMap.containsKey(square)) {
                count += freqMap.get(square);
            }
            
            // Record current element into frequency map for future indices
            freqMap.put(val, freqMap.getOrDefault(val, 0L) + 1L);
        }
        
        System.out.println(count);
        
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HSH02)