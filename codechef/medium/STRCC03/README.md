# STRCC03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Binary strings

Let us solve a problem on binary strings
You are given 2 separate binary strings - $A$ and $B$ - both of equal length.
You need to output the following

- Count of '1's in each string
- Count of indices ($i$) where $A[i] = B[i]$
### Input Format
- The first line will contain $t$ - the number of test cases. Then the test cases follow
- Each test case consists of two lines of input the string $A$ on the $1^{st}$ line and the string $B$ on the $2^{nd}$ line
### Output Format
- Each test case should contain 1 line of output, with three space separated integers Count of $'1'$s in string $A$ Count of $'1'$s in string $B$ Count of indices $i$ where $A[i] = B[i]$
### Sample 1:
Input
Output

```
2
10001
10000
10101
00110
```

```
2 1 4
3 2 2
```

### Explanation:

 **Test case 1** : The number of '1's in $A$ is 2.
The number of '1's in $B$ is 1.
For 4 indices - A[i] = B[i].

 **Test case 1** : The number of '1's in $A$ is 3.
The number of '1's in $B$ is 2.
For 2 indices - A[i] = B[i].

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T15:59:46.215Z  

```c_cpp
//Solution as follows
#include <stdio.h>
#include <string.h>

int main() {
    int t;
    scanf("%d", &t);
    while (t--) {
        char A[101], B[101];
        scanf("%s%s", A, B);

        int a_count = 0, b_count = 0, common = 0;
        for (int i = 0; i < strlen(A); i++) {
            if (A[i] == '1') {
                a_count++;
            }
        }

        for (int i = 0; i < strlen(B); i++) {
            if (B[i] == '1') {
                b_count++;
            }
        }

        for (int i = 0; i < strlen(A); i++) {
            if (A[i] == B[i]) {
                common++;
            }
        }

        printf("%d %d %d\n", a_count, b_count, common);
    }
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/STRCC03)