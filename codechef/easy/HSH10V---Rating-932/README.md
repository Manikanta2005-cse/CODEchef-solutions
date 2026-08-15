# HSH10V - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:07:36.201Z  

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            mp.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(mp.get(arr[i]) + " ");
        }
        System.out.println();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/HSH10V)