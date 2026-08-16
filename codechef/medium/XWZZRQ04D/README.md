# XWZZRQ04D

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - Find the output

What will be the output of the following Java program if the user enters the values: 5 10 15 20 25?

```
import java.util.ArrayList;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // Taking 5 inputs from user
        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(arr.get(2) + 5);

        sc.close();
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:02:46.723Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/XWZZRQ04D)