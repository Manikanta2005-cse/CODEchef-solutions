# Mersenne Prime

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Mersenne Prime is a prime number that is one less than a power of two. In other words, any prime is Mersenne Prime if it is of the form 2k-1 where k is an integer greater than or equal to 2. First few Mersenne Primes are 3, 7, 31 and 127.

The task is to find all Mersenne Primes smaller than equal to an input positive integer n.

 **Examples :** 

```
Input: n = 10
Output: 3 7
Explanation: 3 and 7 are only <= n primes in the form of 2k - 1. 

```

```
Input: n = 100
Output: 3 7 31
Explanation: 3, 7 and 31 are only <= n primes which are in the form of 2k - 1.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:38:35.503Z  

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> allMersennePrimeNo(int n) {
        List<Integer> result = new ArrayList<>();
        int k = 2;
        while (true) {
            long val = (1L << k) - 1;
            if (val > n) {
                break;
            }
            if (isPrime((int) val)) {
                result.add((int) val);
            }
            k++;
        }
        return result;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/mersenne-prime1438/1)