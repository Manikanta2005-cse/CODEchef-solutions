# DAA050 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Uniqueness of an array

You are given an array $A$, determine if all the values present in $A$ are unique or not.

A value in an array is unique if and only if the frequency of its occurrence is exactly one.

If all the values are unique print `YES` else print `NO`.

### Task
- Submit the brute force approach and check out the verdict.
- Implement presorting to solve this problem.
### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases. The description of the test cases follows.
- The first line of each test case contains a single integer $N$, denoting the length of array $A$.
- The second line of each test case contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ — denoting the array $A$.
### Output Format

For each test case, output `YES` if all the values in the array are unique, else output `NO`.

### Constraints
- $1 \leq T \leq 100$
- $2 \leq N \leq 10^5$
- $1 \leq A_i \leq 10^9$
- The sum of $N$ across all test cases does not exceed $10^5$
### Sample 1:
Input
Output

```
2
4
1 2 1 3
4
1 2 5 3
```

```
NO
YES
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:51:17.679Z  

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);

            boolean found = false;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] == a[i + 1]) {
                    found = true;
                }
            }

            if (found) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DAA050)