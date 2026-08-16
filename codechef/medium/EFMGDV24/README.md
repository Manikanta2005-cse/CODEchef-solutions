# EFMGDV24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Even Integers
- You have an ArrayList of Integer objects.
- Your task is to calculate the sum of all the even integer values stored in this ArrayList. You'll need to iterate through the ArrayList, check if a number is even, and if so, add it to the total sum.

 **Output format:** 

```
The sum of even numbers is: 12

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:47:47.739Z  

```java
import java.util.ArrayList;

class EvenSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        int sum = 0;
        // Iterate through the ArrayList and calculate the sum of even numbers
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println("The sum of even numbers is: " + sum);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV24)