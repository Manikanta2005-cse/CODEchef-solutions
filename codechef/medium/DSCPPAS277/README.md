# DSCPPAS277

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Flipping subarray
- You are given a binary array $arr$ whose elements are only $0$ and $1$. Your task is to find the length of the longest subarray that contains only $1s$ after flipping exactly one contiguous subarray from $0$ to $1$.
- You must perform the flip operation at least once.
### Input Format
- The first line contains one integer $n$, the size of the array. - Next line contains $n$ integers $arr[0],arr[1]...arr[n]$, representing the elements of the array.
### Output Format
- Find length of longest subarray with $1$ after flipping one contiguous subarray.
### Constraints
- $1 \leq n \leq 10^5$
- $0 \leq arr[i] \leq 1$
### Sample 1:
Input
Output

```
3
0 1 0

```

```
2
```

### Explanation:

Flip the first contiguous 0 to make it 1, the arr would look like 1,1,0. it contains 2 ones that are maximum from all possible cases.

### Sample 2:
Input
Output

```
3
0 0 0

```

```
3
```

### Explanation:

FLip all the elements as it is contiguous, then the arr would look like 1,1,1 and it has a maximum number of ones that is 3.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T15:11:07.239Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int prevOne = 0, currZero = 0, nextOne = 0;
        int ans = 0, zero = 0, i = 0;

        while (i < n) {
            while (i < n && s[i] == 0) {
                zero++;
                currZero++;
                i++;
            }
            while (i < n && s[i] == 1) {
                nextOne++;
                i++;
            }
            ans = Math.max(ans, prevOne + currZero + nextOne);
            prevOne = nextOne;
            currZero = 0;
            nextOne = 0;
        }

        if (ans == n && zero == 0) {
            System.out.println(ans - 1);
        } else {
            System.out.println(ans);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DSCPPAS277)