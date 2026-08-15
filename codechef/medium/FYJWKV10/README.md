# FYJWKV10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Employee ID Validation with Custom Exception

Practice one more problem on creating a new extended  **Exception class**  to hammer it home. You are given a Java program that checks the strength of a `password`. If the `password` is too short (less than 6 characters), it should throw a custom exception named `WeakPasswordException`. The main program and logic for password checking are already written.

 **Task to Perform:** 

- Create a custom exception class named WeakPasswordException by extending the Exception class.
- Add a constructor to this class that accepts a String message and passes it to the superclass (Exception) using super(message).

 **Output format:** 

```
Error: Password is too short. Minimum 6 characters required.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:37:22.843Z  

```java
// Create custom exception class WeakPasswordException here 
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message){
        super(message);
    }
}




public class Main {
    public static void main(String[] args) {
        String password = "12345";

        try {
            if (password.length() < 6) {
                throw new WeakPasswordException("Password is too short. Minimum 6 characters required.");
            }
            System.out.println("Password accepted.");
        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FYJWKV10)