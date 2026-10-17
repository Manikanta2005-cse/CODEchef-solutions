# SESO36

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### NGE

Given an array of integers, find the next greater element for each element in the array. The next greater element for an element x in the array is the first greater element on the right side of x in the array. If no such element exists, output -1 for that element.

### Input Format
- The first line contains an integer n, representing the number of elements in the array.
- The second line contains n integers, representing the elements of the array.
### Output Format
- Output n integers, each representing the next greater element for the corresponding element in the array.
### Sample 1:
Input
Output

```
4
4 5 2 10

```

```
5 10 10 -1

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T15:27:45.164Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(res[i]).append(i == n - 1 ? "" : " ");
        }
        System.out.println(sb.toString());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SESO36)