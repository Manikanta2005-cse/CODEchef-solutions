# DSAPROB16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sort Array by Parity

You are given an array of integers. Your task is to sort the array such that all odd numbers come before all even numbers while maintaining the original relative order of the odd and even numbers.

### Input Format
- The first line contains an integer $N$ (the array size).
- The second line contains $N$ space-separated integers representing the elements of the array.
### Output Format

Output the sorted array where all odd numbers appear before all even numbers, maintaining the relative order.

### Constraints
- $1 \leq N \leq 10^5$
- $0 \leq a[i] \leq 10^9$
### Sample 1:
Input
Output

```
5
3 1 2 4 5
```

```
3 1 5 2 4
```

### Explanation:

In the given array, the odd numbers are 3,1 and 5, and the even numbers are 2 and 4. After sorting by parity while maintaining the original order, the result is 3,1,5,2,4.

### Sample 2:
Input
Output

```
6
2 4 6 1 3 5
```

```
1 3 5 2 4 6
```

### Explanation:

In the given array, the odd numbers are 1,3 and 5, and the even numbers are 2,4 and 6. After sorting by parity while maintaining the original order, the result is 1,3,5,2,4,6.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T15:53:05.669Z  

```java
import java.util.*;

public class Main {
    public static void sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int index = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                temp[index++] = num;
            }
        }

        for (int num : nums) {
            if (num % 2 == 0) {
                temp[index++] = num;
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        sortArrayByParity(nums);

        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + (i == N - 1 ? "" : " "));
        }
        System.out.println();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSAPROB16)