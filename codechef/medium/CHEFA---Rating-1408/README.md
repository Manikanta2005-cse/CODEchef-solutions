# CHEFA - Rating 1408

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef and easy problem

Chef and Roma are playing a game. Rules of the game are quite simple. Initially there are  **N**  piles of stones on the table. In each turn, a player can choose one pile and remove it from the table. Each player want to maximize the total number of stones removed by him. Chef takes the first turn.

Please tell Chef the maximum number of stones he can remove assuming that both players play optimally.

### Input

The first line of the input contains an integer  **T**  denoting the number of test cases. The description of  **T**  test cases follows.

The first line of each test case contains a single integer  **N**  denoting the number of piles.

The second line contains  **N**  space separated integers  **A1**,  **A2**,...,  **AN**  denoting the number of stones in each pile.

### Output

For each test case, output a single line containg the maximum number of stones that Chef can remove.

### Constraints
- 1 ≤ Ai ≤ 109
- Subtask 1 (35 points): T = 10, 1 ≤ N ≤ 1000
- Subtask 2 (65 points): T = 10, 1 ≤ N ≤ 105

### Sample 1:
Input
Output

```
2
3
1 2 3
3
1 2 1
```

```
4
3
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T14:58:35.308Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a, Collections.reverseOrder());
            long chefSum = 0;
            for (int i = 0; i < n; i += 2) {
                chefSum += a[i];
            }
            System.out.println(chefSum);
        }
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CHEFA)