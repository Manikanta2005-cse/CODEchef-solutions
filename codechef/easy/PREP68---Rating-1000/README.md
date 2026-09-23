# PREP68 - Rating 1000

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Difference Pairs

You are given an array $A$ of $N$ integers and an integer $B$. Your task is to determine whether there exists a pair of indices $(i, j)$ such that $1 \leq i < j \leq N$ and $|A[i] - A[j]| = B$.

## Function Declaration
### Function Name

$hasPairWithDifference$ – This function checks if there is any valid pair in the array with an absolute difference exactly equal to $B$.

### Parameters
- $A$ : A list/array of integers of length $N$, representing the input sequence.
- $N$ : An integer representing the number of elements in the array.
- $B$ : An integer representing the target absolute difference.
### Return Value

Returns an integer(or boolean): `1` (or `true`) if such a pair exists, and `0` (or `false`) otherwise.

### Constraints:
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- $-10^9 \leq A[i] \leq 10^9$ for each $1 \leq i \leq N$
- $0 \leq B \leq 2 \cdot 10^9$
- The sum of $N$ over all test cases won't exceed $2 \cdot 10^5$.

 **The input and output formats provided below are only for testing with custom inputs. You only need to return the value. Printing is handled automatically** 

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains two space-separated integers $N$ and $B$. The next line contains $N$ space-separated integers representing array $A$.
### Output Format

For each test case, output on a new line $1$ if there exists a pair of indices $(i, j)$ $(1\le i \lt j \le N)$ such that $abs(A_i - A_j) = B$, or $0$ otherwise.

### Sample 1:
Input
Output

```
3
6 78
5 10 3 2 50 80
2 30
-10 20
4 5
1 2 3 4

```

```
1
1
0
```

### Explanation:

 **Test case $1$:**  Given $A$ as $[5, 10, 3, 2, 50, 80]$. Elements with difference $78$ are $A_6 = 80$ and $A_4 = 2$.

 **Test case $2$:**  Given $A$ as $[-10, 20]$. Elements with difference $30$ are $A_2 = 20$ and $A_1 = -10$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T15:55:15.460Z  

```java
public static int hasPairWithDifference(int[] A, int N, int B) {
        Arrays.sort(A);
        int i = 0, j = 1;
        
        while (i < N && j < N) {
            if (i != j && A[j] - A[i] == B) {
                return 1;
            } else if (A[j] - A[i] < B) {
                j++;
            } else {
                i++;
            }
        }
        return 0;
    }
```

---

[View on CodeChef](https://www.codechef.com/problems/PREP68)