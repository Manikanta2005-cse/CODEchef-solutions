# FYJWKV09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Validate Product Code
- Create a custom exception class named InvalidEmployeeIdException
- That accepts a customized message through its constructor and calls Exception class by passing this message.

 **Output format:** 

```
Employee 1 ID: EMP-1234
Exception caught: Invalid Employee ID format. Must be EMP-NNNN

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:35:26.726Z  

```java
class InvalidEmployeeIdException extends Exception {
    public InvalidEmployeeIdException(String message) {
        super(message);
    }
}

class Employee {
    private String employeeId;

    public Employee(String employeeId) throws InvalidEmployeeIdException {
        if (!isValidEmployeeId(employeeId)) {
            throw new InvalidEmployeeIdException("Invalid Employee ID format. Must be EMP-NNNN");
        }
        this.employeeId = employeeId;
    }

    private boolean isValidEmployeeId(String employeeId) {
        return employeeId.matches("EMP-\\d{4}");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public static void main(String[] args) {
        try {
            Employee employee1 = new Employee("EMP-1234");
            System.out.println("Employee 1 ID: " + employee1.getEmployeeId());

            Employee employee2 = new Employee("EMP-ABCD"); // Invalid format
            System.out.println("Employee 2 ID: " + employee2.getEmployeeId()); // This line won't be executed if the exception is thrown
        } catch (InvalidEmployeeIdException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FYJWKV09)