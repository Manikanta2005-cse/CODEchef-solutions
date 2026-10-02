# DSAPROB18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef Square Tile Problem

The chef buys square tiles of size $1*1$ from N shops. The ith shop sells $a[i]$ tiles. The chef wants to know if he can create a large, tiled square area using all the tiles he bought.

### Input Format
- The first line contains a single integer $N$.
- The second line contains $N$ space-separated integers $a[i]$.
### Output Format
- Output "Yes" if the Chef can create a square area using all the tiles.
- Output "No" otherwise.
### Constraints
- $1 \leq N \leq 10^5$
- $0 \leq a[i] \leq 10^9$
### Sample 1:
Input
Output

```
3
4 9 7
```

```
No
```

### Explanation:

The sum of tiles is 20, which is not a perfect square.

### Sample 2:
Input
Output

```
2
16 9
```

```
Yes
```

### Explanation:

The sum of tiles is 25, which is a perfect square (5x5).

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T16:03:25.629Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        long totalTiles = 0;
        for (int i = 0; i < n; i++) {
            totalTiles += sc.nextLong();
        }
        
        long root = (long) Math.sqrt(totalTiles);
        if (root * root == totalTiles) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSAPROB18)