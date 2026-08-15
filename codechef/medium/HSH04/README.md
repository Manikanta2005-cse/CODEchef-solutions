# HSH04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ

Which property should a good hash function have to minimize collisions?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T15:58:39.193Z  

```cpp
import java.util.Scanner;

public class Main {
    static final int M = 999983;

    static int f(int x) {
        return x % M;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int x = scanner.nextInt();
            System.out.println("x = " + x + ", f(x) = " + f(x));
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/HSH04)