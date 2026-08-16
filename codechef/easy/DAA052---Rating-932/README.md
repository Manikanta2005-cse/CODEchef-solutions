# DAA052 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Mode of an Array

Mode is defined as the element which occurs most frequently in a data.
You are given an array $A$ of size $N$, find the mode of the this array.

If there are multiple elements with highest frequencies, print the smallest of them.

### Task

Presort the array to solve the problem

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases. The description of the test cases follows.
- The first line of each test case contains a single integer $N$, denoting the length of array $A$.
- The second line of each test case contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ — denoting the array $A$.
### Output Format

For each test case, output on a new line the mode of the array.

### Constraints
- $1 \leq T \leq 1000$
- $2 \leq N \leq 10^5$
- $1 \leq A_i \leq 10^9$
- The sum of $N$ across all test cases does not exceed $10^5$
### Sample 1:
Input
Output

```
2
4
1 4 1 2
4
5 2 3 4
```

```
1 
2
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:52:17.379Z  

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

            int maxFrequency = 0, mode = 0;

            for (int i = 0; i < n; i++) {
                int j = i;
                // Run while we get the same adjacent elements
                while (j < n && a[j] == a[i]) {
                    j++;
                }

                int frequency = j - i;
                if (frequency > maxFrequency) {
                    mode = a[i];
                    maxFrequency = frequency;
                }

                i = j - 1;
            }

            System.out.println(mode);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DAA052)