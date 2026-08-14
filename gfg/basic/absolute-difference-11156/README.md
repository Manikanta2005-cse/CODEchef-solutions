# Absolute Difference of 1

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]** and a number **k,** find all the numbers less than  **k** that have at least two digits and the absolute difference between every adjacent digit of that number should be  **1**.

 **Note:** Return an empty list if no such number is present.

 **Examples:** 

```
Input: arr[] = [7, 98, 56, 43, 45, 23, 12, 8], k = 54
Output: [43, 45, 23, 12]
Explanation: 43 45 23 12 all these numbers have adjacent digits diff as 1 and they are less than 54.
```

```
Input: arr[] = [87, 89, 45, 235, 465, 765, 123, 987, 499, 655], k = 1000
Output: [87, 89, 45, 765, 123, 987]
Explanation: 87 89 45 765 123 987 all these numbers have adjacent digits diff as 1 and they are less than 1000.

```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
1 ≤ k, arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:36:54.677Z  

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    int[] getDigitDiff1AndLessK(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
           
            if (num < k && num >= 10 && hasAdjacentDiffOne(num)) {
                result.add(num);
            }
        }
        int[] resArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArray[i] = result.get(i);
        }

        return resArray;
    }

    
    private boolean hasAdjacentDiffOne(int num) {
        while (num >= 10) {
            int lastDigit = num % 10;
            num /= 10;
            int prevDigit = num % 10;

            if (Math.abs(lastDigit - prevDigit) != 1) {
                return false;
            }
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/absolute-difference-11156/1)