# STRCC02A

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create a list of ord values of a string

You are given a string $S$.
You need to generate and output a  **only**  the values from list $A$

- For each character of string $S$ - append its $ord$ value or $ASCII$ value to the array $A$
- S can contain any alphanumeric character [0 - 9], [a - z] and [A to Z]
### Input Format
- The first line will contain $t$ - the number of test cases. Then the test cases follow
- Each line of the test case consists of a single line of input - the string $S$
### Output Format
- Output the list $A$
### Sample 1:
Input
Output

```
3
abc
MXZ
123
```

```
97 98 99
77 88 90
49 50 51
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T16:02:08.231Z  

```c_cpp
//Update the code below
#include <stdio.h>
#include <string.h>

int main() {
    int t;
    scanf("%d", &t);
    
    while(t--) {
        char S[100];
        scanf("%s", S);
        int A[strlen(S)];
        
        for(int i = 0; i < strlen(S); i++) {
            // Converts a character into its ASCII value
            A[i] = (int) S[i];
        }
        
        for(int i = 0; i < strlen(S) ; i++) {
            printf("%d ", A[i]);
        }
        
        printf("\n");
    }

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/STRCC02A)