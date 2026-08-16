# ARRLST07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Storing Names of Employees

In this example, we demonstrate how to  **initialize an ArrayList**  in Java.
Complete the code to get the expected output.

 **Expected Output:** 

```
Employee 1: Alex
Employee 2: Bobby

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T16:52:29.325Z  

```java
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {

        // Here we are storing String type (will be enclosed in " ") of values in ArrayList
        ArrayList<String> employeeNames = new ArrayList<>();
        
        // Complete the code below
        
        employeeNames.add("Alex"); // Fill here
        employeeNames.add("Bobby"); // Fill here

        // Printing the ArrayList elements, will be discussed in next knowledge point
        System.out.println("Employee 1: " + employeeNames.get(0));
        System.out.println("Employee 2: " + employeeNames.get(1));

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ARRLST07)