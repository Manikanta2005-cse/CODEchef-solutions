# EFMGDV23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Integers in ArrayList
- Let's work through an example to solidify your understanding of Wrapper Classes and Autoboxing/Unboxing.
- This worked example showcases how wrapper classes work with collections like ArrayList, which can only store objects.
- It uses autoboxing to automatically convert primitive int values (10, 20, 30) into Integer objects when adding them to the list.
- Then, it uses unboxing to convert these Integer objects back into primitive int values while calculating the total sum using a for loop and finally, it prints the computed sum to the console.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:47:23.910Z  

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

[View on CodeChef](https://www.codechef.com/problems/EFMGDV23)