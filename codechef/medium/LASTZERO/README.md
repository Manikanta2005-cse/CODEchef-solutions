# LASTZERO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Move all the zeros to the last

You are given an integer array $nums$. Your task is to  **shift all the zeroes to the end**  of the array, while keeping the  **relative order of the non-zero elements unchanged**.

 **Important:**  The transformation must be done  **in-place**  without using an extra array.

## Function Declaration
### Function Name

$moveZeroes$ — This function shifts all zeroes in the array to the end, while preserving the order of the remaining elements.

### Parameters

$nums$: A reference to a array of integers.

- The array contains both zero and non-zero integers.
- You must modify the array directly (in-place), without allocating another array.
### Return Value

This function returns  **void**. The rearranged elements must be stored directly inside the original $nums$ array.

`The input and output formats provided below are only for testing with custom inputs.`

## Constraints
- $1 \leq \text{T} \leq 10$
- $1 \leq \text{nums.length} \leq 10^4$
- $-2^{31} \leq \text{nums}[i] \leq 2^{31} - 1$
### Input Format

The first line contains a single integer  **T**  — the number of test cases.

For each test case:

- The first line contains an integer N — the length of the array.
- The second line contains N space-separated integers representing the array.
### Output Format
- For each test case, print the modified array after all zeroes have been moved to the end.
- If the array has only non-zero numbers, print it unchanged.
### Sample 1:
Input
Output

```
3
7
4 0 5 0 0 7 8
5
0 2 0 0 9
1
3

```

```
4 5 7 8 0 0 0 
2 9 0 0 0 
3 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T16:31:07.852Z  

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[i];
                nums[i] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LASTZERO)