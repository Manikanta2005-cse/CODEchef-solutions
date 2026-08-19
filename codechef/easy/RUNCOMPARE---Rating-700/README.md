# RUNCOMPARE - Rating 700

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T15:26:56.643Z  

```java
class Solution {
    public String checkCoupon(int n, int x, int y, int[] prices) {
        long save = 0;
        for (int i = 0; i < n; i++) {
            if (prices[i] >= y) {
                save += y;
            } else {
                save += prices[i];
            }
        }
        if (save > x) {
            return "COUPON";
        } else {
            return "NO COUPON";
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/RUNCOMPARE)