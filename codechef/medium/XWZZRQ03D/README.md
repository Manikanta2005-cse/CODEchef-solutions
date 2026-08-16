# XWZZRQ03D

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Iterating ArrayList with For Loop

In this example, we demonstrate how to take input of numbers from the user and print only the numbers that are even.

### Sample 1:
Input
Output

```
22
23
24
25
26
```

```
Even numbers from input:
22
24
26
```

### Sample 2:
Input
Output

```
23
25
27
29
31
```

```
Even numbers from input:

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:02:04.393Z  

```java
import java.util.ArrayList;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Step 1: Scanner for user input

        ArrayList<Integer> numbers = new ArrayList<>(); // Step 2: Declare an ArrayList

        // Step 3: Take input from user
        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }

        // Step 4: Print only even numbers
        System.out.println("Even numbers from input:");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println(numbers.get(i));
            }
        }

        sc.close(); // Step 5: Close scanner
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/XWZZRQ03D)