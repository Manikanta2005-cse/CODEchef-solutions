# FYJWKV15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bank Account Withdrawal

Practice one more problem on  **custom exceptions**  to hammer it home based on `InvalidEmployeeIdException`.

 **Task to perform:** 

- Create InvalidEmployeeIdException class which should extend Exception class to display a custom message.
- In declaration of Employee constructor declare that Employee constructor might throw InvalidEmployeeIdException.
- In if block of Employee constructor write code to throw an exception. This exception will be thrown if EmployeeId is invalid.
- In try block InvalidEmployeeIdException class exception will be caused for employee2 so in the header of catch block create an object for this class.
- In catch block call getMessage method for InvalidEmployeeIdException class object.

 **Output format:** 

```
Employee 1 ID: EMP-1234
Exception caught: Invalid Employee ID format. Must be EMP-NNNN

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:43:12.331Z  

```java
class InvalidEmployeeIdException extends Exception {
    public InvalidEmployeeIdException(String message) {
        super(message);
    }
}

class Employee {
    private String employeeId;

    public Employee(String employeeId) throws InvalidEmployeeIdException {
        if (!employeeId.matches("EMP-\\d{4}")) {
            throw new InvalidEmployeeIdException("Invalid Employee ID format. Must be EMP-NNNN");
        }
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public static void main(String[] args) {
        try {
            Employee employee1 = new Employee("EMP-1234");
            System.out.println("Employee 1 ID: " + employee1.getEmployeeId());

            Employee employee2 = new Employee("EMP-ABCD"); // Invalid format
        } catch (InvalidEmployeeIdException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FYJWKV15)