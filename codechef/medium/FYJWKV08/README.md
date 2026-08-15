# FYJWKV08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Validate Student ID format

Let's create a  **custom exception**  to validate the format of `StudentID`  **class**. Imagine that your university mandates that all Student IDs must be in the format "ABC-1234". We'll create a custom exception, `InvalidStudentIDException`, and use it to check if a given Student ID is valid.

 **In this example:** 

- We are defining InvalidStudentIDException which extends Exception.
- The Student class constructor now throws InvalidStudentIDException.
- The isValidStudentID method uses a regular expression to check if the Student ID matches the required format.
- If the Student ID is invalid, we throw the custom exception.
- In the main method, we create two Student objects within a try-catch block. If the second Student object has an invalid ID, the InvalidStudentIDException will be caught, and the error message will be printed.

Click on the `submit` button. You'll see that the first `studentID` is printed because it's valid. However, when the second student with an invalid `studentID` is created, the  **custom exception**  is thrown and caught, printing the corresponding error message.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:34:38.086Z  

```java
class InvalidStudentIDException extends Exception {
    public InvalidStudentIDException(String message) {
        super(message);
    }
}

class Student {
    private String studentID;

    public Student(String studentID) throws InvalidStudentIDException {
        if (!isValidStudentID(studentID)) {
            throw new InvalidStudentIDException("Invalid Student ID format.  Must be ABC-1234");
        }
        this.studentID = studentID;
    }

    private boolean isValidStudentID(String studentID) {
        return studentID.matches("[A-Z]{3}-\\d{4}");
    }

    public String getStudentID() {
        return studentID;
    }

    public static void main(String[] args) {
        try {
            Student student1 = new Student("ABC-1234");
            System.out.println("Student 1 ID: " + student1.getStudentID());

            Student student2 = new Student("123-ABCD"); // Invalid format
        } catch (InvalidStudentIDException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FYJWKV08)