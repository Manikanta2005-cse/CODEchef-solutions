# STRCC05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Numerical characters in strings

For some programming problems, it is beneficial to treat numbers as strings.

You are given an integer $A$.
Can the digits of $A$ be rearranged such that the resulting number is divisible by $5$?

### Input Format
- The first line will contain $t$ - the number of test cases. Then the test cases follow
- Each line of the test case consists of a single line of input - the number $A$
### Output Format
- For each test case output 'YES' if the number $A$ can be rearranged such that it becomes divisible by $5$, and 'NO' otherwise
### Sample 1:
Input
Output

```
3
12345
11011
12346
```

```
Yes
Yes
No
```

### Explanation:

 **Test case 1:**  $12345$ is already divisible by 5 - hence output is YES

 **Test case 2:**  $11011$ can be rearranged as $11110$ which is divisible by 5 - hence output is NO

 **Test case 3:**  No arrangement of $12346$ makes it divisible by 5. Hence output is NO

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T16:00:49.541Z  

```c_cpp
//Update the code below to solve the problem
#include <stdio.h>
#include <string.h>

int main() 
{
  int t;
  scanf("%d", &t); 
  while(t--)
  {
   char A[1001];
   scanf("%s", A);
   int flag = 0;

  // If any '0' or '5' is found in the string A - then set flag as 1 and exit the loop
   for(int i=0; i<strlen(A);i++)
      {
        if(A[i]=='0' || A[i]=='5')
          {
            flag = 1;
            break;
          } 
      }
    if(flag == 1 )
      {
        printf("Yes\n");
      }
    else
      {
        printf("No\n");
      }

  }
 return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/STRCC05)