# EFMGDV24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:47:25.953Z  

```java
import java.util.ArrayList;

class WrapperExample {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Integer objects (Autoboxing)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // Autoboxing: int 10 becomes Integer object
        numbers.add(20); // Autoboxing: int 20 becomes Integer object
        numbers.add(30); // Autoboxing: int 30 becomes Integer object

        // 2. Iterate through the ArrayList and calculate the sum (Unboxing)
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i); // Unboxing: Integer object is converted to int for addition
        }

        // 3. Print the sum
        System.out.println("The sum of the numbers is: " + sum);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV24)