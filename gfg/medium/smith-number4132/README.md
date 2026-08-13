# Smith Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number n, find out whether this number is a Smith number or not. A Smith number is a composite number whose sum of digits is equal to the sum of digits of its prime factorization.

 **Examples:** 

```
Input: n = 648
Output: true
Explanation: 648 = 23*34, 6+4+8 = 2+2+2+3+3+3+3. And 648 is composite.
```

```
Input: n = 762
Output: true
Explanation: 762 = 21 *31* 1271 is a Smith number because 7+6+2 = 2+3+(1+2+7) is composite.
```

```
Input: n = 7
Output: false
Explanation: 7 is not a Smith number because 7 is not a composite.
```

 **Constraints:** 
1 <= n <= 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:56:05.233Z  

```java
class Solution {
    public boolean smithNum(int n) {
        if (isPrime(n)) {
            return false;
        }

        int digitSum = getSumOfDigits(n);
        int primeFactorDigitSum = 0;
        int temp = n;

        for (int i = 2; i * i <= temp; i++) {
            while (temp % i == 0) {
                primeFactorDigitSum += getSumOfDigits(i);
                temp /= i;
            }
        }

        if (temp > 1) {
            primeFactorDigitSum += getSumOfDigits(temp);
        }

        return digitSum == primeFactorDigitSum;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int getSumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smith-number4132/1)