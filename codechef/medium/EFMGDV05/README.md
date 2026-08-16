# EFMGDV05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Manage Employee Salaries

You are building a simple employee management system in Java using the `Employee`  **class**, which stores the `name`, `role`, and `salary` of each `Employee`. The `Main`  **class**  is intended to manage a list of employees and display their details. The structure of the `Employee`  **class**  has already been defined. Your task is to complete the `Main` class by working with an `ArrayList` of `Employee`  **objects**.

 **Task to Perform:**  Complete the main method in the Main class by performing the following steps:

- Create an ArrayList that can store objects of type Employee and declare it before creating the employee objects.
- Add three Employee objects (employee1, employee2, and employee3) to the ArrayList using the add() method.
- Display employee details: Display employee details for all the employees using getter methods.

 **Output format:** 

```
Name: Alice, Role: Developer, Salary: 60000.0
Name: Bob, Role: Designer, Salary: 50000.0
Name: Charlie, Role: Manager, Salary: 75000.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:35:15.818Z  

```java
import java.util.ArrayList;

class Employee {
    private String name;
    private String role;
    private double salary;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 2: Create an ArrayList and Add Employees
        ArrayList employeeList = new ArrayList<>();

        Employee employee1 = new Employee("Alice", "Developer", 60000.0);
        Employee employee2 = new Employee("Bob", "Designer", 50000.0);
        Employee employee3 = new Employee("Charlie", "Manager", 75000.0);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        // Step 3: Display the Employee Details without using a loop
        Employee emp1 = (Employee) employeeList.get(0);
        System.out.println("Name: " + emp1.getName() + ", Role: " + emp1.getRole() + ", Salary: " + emp1.getSalary());

        Employee emp2 = (Employee) employeeList.get(1);
        System.out.println("Name: " + emp2.getName() + ", Role: " + emp2.getRole() + ", Salary: " + emp2.getSalary());

        Employee emp3 = (Employee) employeeList.get(2);
        System.out.println("Name: " + emp3.getName() + ", Role: " + emp3.getRole() + ", Salary: " + emp3.getSalary());
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV05)