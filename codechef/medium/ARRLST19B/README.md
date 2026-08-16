# ARRLST19B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### ArrayList size() Method

In this task, you need to print the number of elements in an array using the array's size() method. Complete the following code:

```
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        int size = ______; 
        System.out.println("ArrayList Size: " + size);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T16:59:44.774Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/ARRLST19B)