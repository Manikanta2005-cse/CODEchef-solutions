# HSH02B - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Hashing Function Example

We can use multiple Hash Functions.
One simple example of a Hash function is the modulo operator $\%$ (We had used this to explain how hashing works).

We can define the Hash function as $f(x) = x$ $\%$ $M$. Here $M$ is an arbitrary integer.
The output range of this function will be $[0, M-1]$.
So we need to choose $M$ such that we are able to index all the values from $0$ to $M-1$.

We can safety make $M$ as large as $10^6$.
Also we will try to choose $M$ as a prime number so that the output is distributed evenly.

Let's fix $M$ as $999983$ for now - it's a prime number and is small enough to be indexed.

### Task

Run the code in the IDE and check the output.

### Sample 1:
Input
Output

```
13
1000000000
342561313
1341234
523151339
```

```
x = 13, f(x) = 13
x = 1000000000, f(x) = 17000
x = 342561313, f(x) = 567127
x = 1341234, f(x) = 341251
x = 523151339, f(x) = 160230
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T15:58:06.914Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/HSH02B)