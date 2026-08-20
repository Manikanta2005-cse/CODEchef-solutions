# PREFPRO1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Creating Prefix Array

A "prefix array" is a data structure commonly used in programming, particularly in algorithms related to strings or arrays. Also known as a "prefix sum array", it stores cumulative sums of elements in an array.

We generally use it to optimize the time complexity of a given algorithm.

Using a prefix array in an array of integers: -

```
array (a)        -> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
prefix array (b) -> [1, 3, 6, 10, 15, 21, 28, 36, 45, 55]

```

We created a prefix array, which stores a cumulative sum of all the previous indexes of the array. This is our prefix array for  **a**.

Similarly, we also have prefix arrays for strings:

```
string s = "codechef";
prefixOfs = [c,co,cod,code,codec,codech,codeche,codechef]; 

```

We created a prefix array for "codechef". In strings, we use the prefix array in a different manner. We concatenate characters in our prefix array of strings.

 **Pseudo Code for prefix sum** 

```
PrefixSum(arr)
Input: Array arr of size N
Output: Prefix sum array prefixSum of size N

Initialize an array prefixSum of size N

prefixSum[0] = arr[0]
for i = 1 to N-1 do
    prefixSum[i] = prefixSum[i-1] + arr[i]
return prefixSum

```

### Task
- In the first line, given an integer N, the length of an array.
- In the second line, given N integers in an array A1, A2,... AN,.
- Print the prefix sum of the array.
### Constraints
- $1 \leq N \leq 100000$
- $1 \leq Ai \leq 1000$
### Sample 1:
Input
Output

```
4
5 3 3 13
```

```
5 8 11 24
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-20T16:11:14.093Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
                System.out.print(sum + (i == n - 1 ? "" : " "));
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PREFPRO1)