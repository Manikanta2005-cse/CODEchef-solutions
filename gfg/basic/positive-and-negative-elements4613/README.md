# Positive and negative elements

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]** containing equal number of positive and negative elements, arrange the array such that every positive element is followed by a negative element. The relative order of positive and negative numbers should be maintained.

 **Examples:** 

```
Input: arr[] = [-1, 2, -3, 4, -5, 6]
Output: [2, -1, 4, -3, 6, -5]
Explanation: Positive numbers in their original order are 2, 4, 6, and negative numbers are -1, -3, -5. Placing them alternately starting with a positive element gives [2, -1, 4, -3, 6, -5].

```

```
Input: arr[] = [-3, 2, -4, 1]
Output: [2, -3, 1, -4] 
Explanation: Positive numbers in order are 2, 1, and negative numbers are -3, -4. Arranging them alternately results in [2, -3, 1, -4].
```

 **Constraints:** 
2 ≤ arr.size() ≤ 105
-106 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:32:26.923Z  

```java
import java.util.ArrayList;

class Solution {
    ArrayList<Integer> arranged(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while (i < pos.size() && j < neg.size()) {
            ans.add(pos.get(i++));
            ans.add(neg.get(j++));
        }
        while (i < pos.size()) {
            ans.add(pos.get(i++));
        }
        while (j < neg.size()) {
            ans.add(neg.get(j++));
        }

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/positive-and-negative-elements4613/1)