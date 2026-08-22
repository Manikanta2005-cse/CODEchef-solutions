# Pascal Triangle

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a positive integer  **n**, return the  **nth row of  *pascal's triangle***.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.

 **Examples:** 

```
Input: n = 4
Output: [1, 3, 3, 1]
Explanation: 4th row of pascal's triangle is [1, 3, 3, 1].
```

```
Input: n = 5
Output: [1, 4, 6, 4, 1]
Explanation: 5th row of pascal's triangle is [1, 4, 6, 4, 1].

```

```
Input: n = 1
Output: [1]
Explanation: 1st row of pascal's triangle is [1].
```

 **Constraints:** 
1 ≤ n ≤ 30

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T16:49:02.499Z  

```java
import java.util.ArrayList;

class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> row = new ArrayList<>();
        long val = 1;
        row.add(1);
        for (int r = 1; r < n; r++) {
            val = val * (n - r) / r;
            row.add((int) val);
        }
        return row;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/pascal-triangle0652/1)