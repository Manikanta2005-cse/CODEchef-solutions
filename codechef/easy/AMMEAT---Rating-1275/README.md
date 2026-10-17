# AMMEAT - Rating 1275

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Andrew and the Meatballs

Andrew likes meatballs very much.

He has  **N**  plates of meatballs, here the  **i** th plate contains  **Pi**  meatballs. You need to find the minimal number of plates Andrew needs to take to his trip to Las Vegas, if he wants to eat there at least  **M**  meatballs. Note that each plate is already packed, i.e. he cannot change the amount of meatballs on any plate.

### Input

The first line of the input contains an integer  **T**, denoting the number of test cases. The description of  **T**  test cases follows. The first line of each test case contains two space-separated integers  **N**  and  **M**. The second line contains  **N**  space-separated integers  **P1**,  **P2**,...,  **PN**.

### Output

For each test case, output an integer, denoting the minimum number of plates. If it's impossible to take at least  **M**  meatballs, print  **-1**.

### Constraints
- 1 ≤ T ≤ 7777
- 1 ≤ N ≤ 7
- 1 ≤ M, Pi ≤ 1018
### Sample 1:
Input
Output

```
1
4 7
1 2 3 4
```

```
2
```

### Explanation:

If he takes  **3** rd and  **4** th plates, then we may eat  **P3 + P4 = 7**  meatballs in Las Vegas. This is the only way for eating at least  **M = 7**  meatballs with  **2**  plates.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T14:57:30.907Z  

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
            long m = sc.nextLong();
            Long[] p = new Long[n];
            long totalSum = 0;
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextLong();
                totalSum += p[i];
            }
            if (totalSum < m) {
                System.out.println(-1);
                continue;
            }
            Arrays.sort(p, Collections.reverseOrder());
            long currentSum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                currentSum += p[i];
                count++;
                if (currentSum >= m) {
                    break;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/AMMEAT)