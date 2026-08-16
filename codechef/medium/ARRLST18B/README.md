# ARRLST18B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Office Departments Capacity

In this example, we demonstrate how to display  **department capacities**  using an  **integer**  ArrayList in Java. We also show how to determine the total number of departments using the size() method.

 **When executed, the code will show:** 

```
Number of Departments: 4  
Capacity of Department 1: 10  
Capacity of Department 2: 15  
Capacity of Department 3: 8  
Capacity of Department 4: 20

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T16:59:06.745Z  

```java
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        
        // Initialize an ArrayList with department capacities
        ArrayList<Integer> departmentCapacities = new ArrayList<>();
        departmentCapacities.add(10); // Department 1
        departmentCapacities.add(15); // Department 2
        departmentCapacities.add(8);  // Department 3
        departmentCapacities.add(20); // Department 4

        // Use the size() method to print the total number of departments
        System.out.println("Number of Departments: " + departmentCapacities.size());

        // Display individual department capacities without a loop
        System.out.println("Capacity of Department 1: " + departmentCapacities.get(0));
        System.out.println("Capacity of Department 2: " + departmentCapacities.get(1));
        System.out.println("Capacity of Department 3: " + departmentCapacities.get(2));
        System.out.println("Capacity of Department 4: " + departmentCapacities.get(3));
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ARRLST18B)