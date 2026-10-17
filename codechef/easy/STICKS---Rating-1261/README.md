# STICKS - Rating 1261

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Sticks

Chef and his little brother are playing with sticks. They have total  **N**  sticks. Length of  **i** -th stick is  **Ai**. Chef asks his brother to choose any four sticks and to make a rectangle with those sticks its sides. Chef warns his brother to not to break any of the sticks, he has to use sticks as a whole. Also, he wants that the rectangle formed should have the maximum possible area among all the rectangles that Chef's brother can make.

Chef's little brother takes this challenge up and overcomes it. Can you also do so? That is, you have to tell whether it is even possible to create a rectangle? If yes, then you have to tell the maximum possible area of rectangle.

### Input

The first line contains a single integer  **T**  denoting the number of test-cases.  **T**  test cases follow.

The first line of each test case contains a single integer  **N**  denoting the number of sticks.

The second line of each test case contains  **N**  space-separated integers  **A1**,  **A2**,...,  **AN**  denoting the lengths of sticks.

### Output

For each test case, output a single line containing an integer representing the maximum possible area for rectangle or -1 if it's impossible to form any rectangle using the available sticks.

### Constraints
- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 103
- 1 ≤ sum of N's over all test-cases in a single test file ≤ 103
- 1 ≤ Ai ≤ 103
### Sample 1:
Input
Output

```
2
5
1 2 3 1 2
4
1 2 2 3
```

```
2
-1
```

### Explanation:

 **Example case 1.**  Chef's brother can choose sticks of lengths 1, 2, 1, 2. He can create a rectangle with area 1 * 2 = 2.

 **Example case 2.**  It's impossible to choose 4 sticks so that they form a rectangle.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T15:01:26.296Z  

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
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, Collections.reverseOrder());
            
            long l1 = -1, l2 = -1;
            for (int i = 0; i < n - 1; i++) {
                if (a[i].equals(a[i + 1])) {
                    if (l1 == -1) {
                        l1 = a[i];
                        i++;
                    } else if (l2 == -1) {
                        l2 = a[i];
                        i++;
                        break;
                    }
                }
            }
            
            if (l1 != -1 && l2 != -1) {
                System.out.println(l1 * l2);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/STICKS)