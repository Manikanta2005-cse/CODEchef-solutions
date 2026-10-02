# DSCPPAS130

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T16:04:45.361Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] binaryArray = new int[n];
        for (int i = 0; i < n; i++) {
            binaryArray[i] = sc.nextInt();
        }

        int low = 0;
        int high = n - 1;
        int firstOneIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (binaryArray[mid] == 1) {
                firstOneIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (firstOneIndex == -1) {
            System.out.println(0);
        } else {
            System.out.println(n - firstOneIndex);
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSCPPAS130)