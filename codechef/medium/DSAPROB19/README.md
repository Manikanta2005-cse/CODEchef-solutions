# DSAPROB19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Ball Position

You are given $K$ electromagnetic balls that need to be placed on $N$ coordinates on a number line. These balls attract each other, so you need to place them as far apart as possible.

Your task is to determine the maximum possible value of the minimum distance between any two balls after placing all $K$ balls optimally on the given coordinates.

For example, given the coordinates [1, 2, 8, 4, 9] and $K=3$ balls, you need to place the balls in such a way that they are as far apart as possible. By sorting the coordinates, we get [1, 2, 4, 8, 9]. Placing the balls at positions 1, 4, and 8 maximizes the minimum distance between any two balls, which is 3. Hence, the maximum possible value of the minimum distance between any two balls is 3.

Return the minimum distance between any two balls.

### Input Format
- The first line contains two integers $N$ and $K$.
- The second line contains $N$ unique integers $pos[i]$, the coordinates on the number line.
### Output Format
- Output a single integer representing the maximum minimum distance between any two balls.
### Constraints
- $2 \leq K \leq N$
- $2 \leq N \leq 10^5$
- $-10^9 \leq pos[i] \leq 10^9$
### Sample 1:
Input
Output

```
6 4
1 2 4 8 9 12
```

```
3
```

### Explanation:

The optimal placement of the balls is at positions 1, 4, 8, and 12. The minimum distance between any two balls is 3.

### Sample 2:
Input
Output

```
5 3
1 2 8 4 9
```

```
3
```

### Explanation:

The optimal placement of the balls is at positions 1, 4, and 8. The minimum distance between any two balls is 3.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T16:09:42.329Z  

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[i] = sc.nextInt();
        }

        Arrays.sort(pos);

        int low = 1;
        int high = pos[n - 1] - pos[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(pos, n, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
        sc.close();
    }

    public static boolean check(int[] pos, int n, int k, int d) {
        int count = 1;
        int lastPosition = pos[0];

        for (int i = 1; i < n; i++) {
            if (pos[i] - lastPosition >= d) {
                count++;
                lastPosition = pos[i];
            }
            if (count >= k) {
                return true;
            }
        }

        return false;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSAPROB19)