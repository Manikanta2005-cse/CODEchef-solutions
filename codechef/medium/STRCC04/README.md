# STRCC04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Numerical characters in strings

Recall that for some programming problems, it is beneficial to treat numbers as strings.

You are given 2 integers $A$ and $B$ - they contain the same number of digits.
You need to determine if these numbers are  **reverse**  of each other.

### Input Format
- The first line will contain $t$ - the number of test cases. Then the test cases follow
- Each line of the test case consists of a two line of input the number $A$ on the $1^{st}$ line and the number $B$ on the $2^{nd}$ line
### Output Format
- Each test case output 'YES' if the numbers are palindromes of each other and 'NO' otherwise
### Sample 1:
Input
Output

```
2
1005
5001
12345
53321
```

```
YES
NO
```

### Explanation:

 **Test case 1:**  $5001$ when reversed gives us $1005$. Hence we output $YES$

 **Test case 2:**  $12345$ when reversed does  **NOT**  equal $53321$. Hence we output $NO$

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T16:03:02.732Z  

```c_cpp
//Solution as follows
#include <stdio.h>
#include <string.h>

int main() {
    int t;
    scanf("%d", &t);

    while (t--) {
        char A[100001], B[100001];
        scanf("%s %s", A, B);
        int n = strlen(A);
        int i = 0;
        //Flag is a very imporant tool in programming problems - you will come across various examples in later problems as well
        int flag = 0;

        while (i < n) {
            // Checking A from left to right and B from right to left
            if (A[i] == B[n - i - 1]) {
                i++;
            }
            else {
                // If specific character in A and B do not match, then they cannot be reverse
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            printf("No\n");
        }
        else {
            printf("Yes\n");
        }
    }
    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/STRCC04)