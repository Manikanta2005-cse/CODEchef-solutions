# DAA051 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### MCQ - 1

What will the time complexities of checking uniqueness of an array using Brute-force and Presorting respectively?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:51:49.215Z  

```cpp
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);

            boolean found = false;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] == a[i + 1]) {
                    found = true;
                }
            }

            if (found) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DAA051)