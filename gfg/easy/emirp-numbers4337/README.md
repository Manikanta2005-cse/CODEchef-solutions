# Emirp Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer n, find all Emirp numbers in the range  **[13, n]**. An Emirp number is a prime number whose decimal reverse is also prime, the reversed number is different from the original number, and the reversed number is not greater than n.

 **Note:**  Palindromic primes are not considered Emirp numbers.

 **Examples:** 

```
Input: n = 40
Output: 13 31
Explanation: Only 13 and 31 are prime numbers which are satisfying the given conditions.

```

```
Input: n = 80
Output: 13 17 31 37 71 73 
Explanation: Only 13, 17, 31, 37, 71 and 73 are prime numbers which satisfy the given conditions.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:41:21.609Z  

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] emirpNumbers(int n) {
        if (n < 13) {
            return new int[0];
        }

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 13; i <= n; i++) {
            if (isPrime[i]) {
                int rev = reverse(i);
                if (rev != i && rev <= n && isPrime[rev]) {
                    list.add(i);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/emirp-numbers4337/1)