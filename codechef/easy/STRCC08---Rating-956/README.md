# STRCC08 - Rating 956

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Practice problem - Chef and Happy String

Chef has a string $S$ with him consisting of only lowercase alphabets.
Chef is happy if the string contains a  **contiguous substring**  of length  **strictly greater**  than $2$ in which all its characters are vowels.
Determine whether Chef is happy or not.
 **Note** : in english alphabet, vowels are `a`, `e`, `i`, `o`, and `u`.

### Input Format
- First line will contain $T$, number of test cases. Then the test cases follow.
- Each test case contains of a single line of input, a string $S$.
### Output Format

For each test case, if Chef is happy, print `HAPPY` else print `SAD`.

### Sample 1:
Input
Output

```
4
aeiou
abxy
aebcdefghij
abcdeeafg

```

```
Happy
Sad
Sad
Happy

```

### Explanation:

 **Test case $1$:**  Since the string `aeiou` is a contiguous substring and consists of all vowels and has a length $\gt 2$, Chef is happy.

 **Test case $2$:**  Since none of the contiguous substrings of the string consist of all vowels and have a length $\gt 2$, Chef is sad.

 **Test case $3$:**  Since none of the contiguous substrings of the string consist of all vowels and have a length $\gt 2$, Chef is sad.

 **Test case $4$:**  Since the string `eea` is a contiguous substring and consists of all vowels and has a length $\gt 2$, Chef is happy.

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T16:05:18.415Z  

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
        char S[10001];
        scanf("%s", S);
        int string_Length = strlen(S);
        int i=0;
        int flag=0;
        while(i < (string_Length-2))
        {
            
            if ( S[i] == 'a' || S[i] == 'e' || S[i] == 'i' || S[i] == 'o' || S[i] == 'u')
            {
                if ( S[i+1] == 'a' || S[i+1] == 'e' || S[i+1] == 'i' || S[i+1] == 'o' || S[i+1] == 'u')
                {
                    if ( S[i+2] == 'a' || S[i+2] == 'e' || S[i+2] == 'i' || S[i+2] == 'o' || S[i+2] == 'u')
                    {
                        flag = 1;
                        break;
                    }
                }
            }
            i++;
         }     
            
            if ( flag == 1 )
            {
                printf("Happy\n");
            }
            else
            {
                printf("Sad\n");
            }
        
    }
    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/STRCC08)