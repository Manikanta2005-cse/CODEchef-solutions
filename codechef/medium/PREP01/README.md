# PREP01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Array - Pascals or Khayyams triangle

Given an integer $N$, you need to generate and output the $N^{th}$ row of Pascal's triangle - also known as Khayyam triangle.

 **Note** : It might be possible that the elements of a row do  **not**  fit into a $32$-bit signed integer data type.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of one lines of input - the integer $N$.
### Output Format

For each test case, output on a new line the $N^{th}$ row of Pascal's triangle with a single space between all elements of the row.

 **Note** : It might be possible that the elements of a row do  **not**  fit into a $32$-bit signed integer data type.

### Constraints
- $1 \leq T \leq 3\cdot 10^4$
- $1 \leq N \leq 50$
### Sample 1:
Input
Output

```
4
1
2
3
4

```

```
1
1 1
1 2 1
1 3 3 1
```

### Explanation:

The first couple of rows of pascal triangle look like:

 **Test case $1$:**  The first row contains only the element $1$.

 **Test case $2$:**  The second row contains the elements $1$ and $1$.

 **Test case $3$:**  The third row contains the elements $1, 2,$ and $1$.

 **Test case $4$:**  The fourth row contains the elements $1,3, 3,$ and $1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T16:12:50.257Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long val = 1;
            for (int k = 1; k <= n; k++) {
                System.out.print(val + (k == n ? "" : " "));
                val = val * (n - k) / k;
            }
            System.out.println();
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PREP01)