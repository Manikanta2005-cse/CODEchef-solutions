# Segregate Even and Odd numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **a**  **rr**, write a program segregating  **even** and  **odd** numbers. The program should put all even numbers first in sorted order, and then odd numbers in sorted order.

 **Note** :- You don't have to return the array, you have to modify it in-place.

 **Example:** 

```
Input: arr[] = [12, 34, 45, 9, 8, 90, 3]
Output: [8, 12, 34, 90, 3, 9, 45]
Explanation: Even numbers are 12, 34, 8 and 90. Rest are odd numbers.

```

```
Input: arr[] = [0, 1, 2, 3, 4]
Output: [0, 2, 4, 1, 3]
Explanation: 0 2 4 are even and 1 3 are odd numbers.

```

```
Input: arr[] = [10, 22, 4, 6]
Output: [4, 6, 10, 22]
Explanation: Here all elements are even, so no need of segregataion
```

 **Constraints:** 
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] <=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T17:10:12.222Z  

```java
import java.util.Arrays;

class Solution {
    void segregateEvenOdd(int arr[]) {
        int n = arr.length;
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }
        
        int[] even = new int[evenCount];
        int[] odd = new int[n - evenCount];
        int e = 0, o = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[e++] = arr[i];
            } else {
                odd[o++] = arr[i];
            }
        }
        
        Arrays.sort(even);
        Arrays.sort(odd);
        
        for (int i = 0; i < evenCount; i++) {
            arr[i] = even[i];
        }
        for (int i = 0; i < n - evenCount; i++) {
            arr[evenCount + i] = odd[i];
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-numbers4629/1)