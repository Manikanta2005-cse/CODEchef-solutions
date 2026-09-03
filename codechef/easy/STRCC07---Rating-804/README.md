# STRCC07 - Rating 804

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice problem - Wordle

Chef invented a modified wordle.
There is a hidden word $S$ and a guess word $T$, both of length $5$.
Chef defines a string $M$ to determine the correctness of the guess word. For the $i^{th}$ index:

- If the guess at the $i^{th}$ index is correct, the $i^{th}$ character of $M$ is $\texttt{G}$.
- If the guess at the $i^{th}$ index is wrong, the $i^{th}$ character of $M$ is $\texttt{B}$.

Given the hidden word $S$ and guess $T$, determine string $M$.

### Input Format
- First line will contain $T$, number of test cases. Then the test cases follow.
- Each test case contains of two lines of input.
- First line contains the string $S$ - the hidden word.
- Second line contains the string $T$ - the guess word.
### Output Format

For each test case, print the value of string $M$.

### Sample 1:
Input
Output

```
3
ABCDE
EDCBA
ROUND
RINGS
START
STUNT

```

```
BBGBB
GBBBB
GGBBG

```

### Explanation:

 **Test Case $1$:**  Given string $S = \texttt{ABCDE}$ and $T = \texttt{EDCBA}$. The string $M$ is:

- Comparing the first indices, $\texttt{A} \neq \texttt{E}$, thus, $M[1] = \texttt{B}$.
- Comparing the second indices, $\texttt{B} \neq \texttt{D}$, thus, $M[2] = \texttt{B}$.
- Comparing the third indices, $\texttt{C} = \texttt{C}$, thus, $M[3] = \texttt{G}$.
- Comparing the fourth indices, $\texttt{D} \neq \texttt{B}$, thus, $M[4] = \texttt{B}$.
- Comparing the fifth indices, $\texttt{E} \neq \texttt{A}$, thus, $M[5] = \texttt{B}$. Thus, $M = \texttt{BBGBB}$.

 **Test Case $2$:**  Given string $S = \texttt{ROUND}$ and $T = \texttt{RINGS}$. The string $M$ is:

- Comparing the first indices, $\texttt{R} = \texttt{R}$, thus, $M[1] = \texttt{G}$.
- Comparing the second indices, $\texttt{O} \neq \texttt{I}$, thus, $M[2] = \texttt{B}$.
- Comparing the third indices, $\texttt{U} \neq \texttt{N}$, thus, $M[3] = \texttt{B}$.
- Comparing the fourth indices, $\texttt{N} \neq \texttt{G}$, thus, $M[4] = \texttt{B}$.
- Comparing the fifth indices, $\texttt{D} \neq \texttt{S}$, thus, $M[5] = \texttt{B}$. Thus, $M = \texttt{GBBBB}$.

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T16:04:29.125Z  

```c_cpp
//Solution as follows
#include <stdio.h>
#include <string.h>

int main() 
{
    int t;
    scanf("%d", &t);
    
    while(t--)
    {
        char S[1000], T[1000], M[1000];
        scanf("%s %s", S, T);
        for(int k = 0; k < 5; k++)
        {
           if (S[k] == T[k])
           {
               M[k]='G';
           } 
           
           else
           {
             M[k]='B';
            }
         }
     M[5]='\0'; 
     printf("%s\n", M);
    }
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/STRCC07)