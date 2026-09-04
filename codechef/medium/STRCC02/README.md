# STRCC02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create a replica string

Let's begin with a problem which covers our knowledge of 'String' syntax.

You are given a string $S$ consisting of only  **lowercase**  english characters.
You need to generate 2 separate strings $A$ and $B$

- String $A$ needs to be an exact replica of string $S$ - it has to be created by starting with an empty string
- String $B$ is reverse of string $S$.
### Input Format
- The first line will contain $t$ - the number of test cases. Then the test cases follow
- Each line of the test case consists of a single line of input - the string $S$
### Output Format
- Each test case will contain 2 lines of output Line 1: Output string $A$ Line 2: Output string $B$
### Sample 1:
Input
Output

```
3
abcde
aaaaa
aaaab

```

```
abcde
edcba
aaaaa
aaaaa
aaaab
baaaa
```

### Explanation:

 **Test case 1** : $S$ is $abcde$

- $A$ becomes $abcde$
- $B$ becomes $edcba$

 **Test case 3** : $S$ is $aaaab$

- $A$ becomes $aaaab$
- $B$ becomes $baaaa$

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T14:54:11.935Z  

```c_cpp
#include <stdio.h>
#include <string.h>

int main() {
    int t;
    if (scanf("%d", &t) != 1) return 0;
    
    while (t--) {
        char S[1005];
        scanf("%s", S);
        
        int len = strlen(S);
        char A[1005];
        char B[1005];
        
        for (int i = 0; i < len; i++) {
            A[i] = S[i];
        }
        A[len] = '\0'; 
        for (int i = 0; i < len; i++) {
            B[i] = S[len - 1 - i];
        }
        B[len] = '\0';
        
        for (int i = 0; i < len; i++) {
            printf("%c", A[i]);
        }
        printf("\n");
        
        for (int i = 0; i < len; i++) {
            printf("%c", B[i]);
        }
        printf("\n");
    }
    
    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/STRCC02)