# VOWANX - Rating 1651

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T15:12:54.393Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] f = new int[n];
            int[] c = new int[m];
            for (int i = 0; i < n; i++) {
                f[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                c[i] = sc.nextInt();
            }

            int i = 0, j = 0;
            int switches = 0;
            int currentChannel = 0;

            while (i < n && j < m) {
                if (f[i] < c[j]) {
                    if (currentChannel != 0) {
                        switches++;
                        currentChannel = 0;
                    }
                    i++;
                } else {
                    if (currentChannel != 1) {
                        switches++;
                        currentChannel = 1;
                    }
                    j++;
                }
            }

            while (i < n) {
                if (currentChannel != 0) {
                    switches++;
                    currentChannel = 0;
                }
                i++;
            }

            while (j < m) {
                if (currentChannel != 1) {
                    switches++;
                    currentChannel = 1;
                }
                j++;
            }

            System.out.println(switches);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/VOWANX)