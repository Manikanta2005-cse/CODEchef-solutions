# Sum Triangle

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**, construct its  **Sum**   **Triangle**  as follows:

- The bottom row of the triangle is the original array.
- Each element in the row above is formed by adding the two adjacent elements directly below it.
- Continue this process until only one element remains at the top of the triangle.

Return all elements of the Sum Triangle in **top-to-bottom**  order, and within each row from  **left to right**.

 **Examples:** 

```
Input: arr[] = [4, 7, 3, 6, 7]
Output: [81, 40, 41, 21, 19, 22, 11, 10, 9, 13, 4, 7, 3, 6, 7]
Explanation:
       81
     40  41
   21  19  22
 11  10   9   13
4   7   3   6    7
The triangle is constructed from bottom to top by summing adjacent elements:
[4, 7, 3, 6, 7]
[11, 10, 9, 13]
[21, 19, 22]
[40, 41]
[81]
Reading the triangle from top to bottom and left to right gives: [81, 40, 41, 21, 19, 22, 11, 10, 9, 13, 4, 7, 3, 6, 7]
```

```
Input: arr[] = [1, 2, 4]
Output: [9, 3, 6, 1, 2, 4] 
Explanation:
   9
 3   6
1  2  4
Reading the triangle from top to bottom and left to right gives: [9, 3, 6, 1, 2, 4] 
```

**Constraints:
**1 ≤ arr.size() ≤ 25
1 ≤ arr[i] ≤ 100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T15:42:10.351Z  

```java
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> getTriangle(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        buildTriangle(arr, result);
        return result;
    }

    private void buildTriangle(int[] arr, ArrayList<Integer> result) {
        
        if (arr.length < 1) {
            return;
        }
        int[] nextRow = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            nextRow[i] = arr[i] + arr[i + 1];
        }

        buildTriangle(nextRow, result);

        for (int num : arr) {
            result.add(num);
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-triangle-for-given-array1159/1)