# PWTIEX23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Calling Methods Using an Object

In this example, the program defines two methods: one that prints a message to the console and another that also prints a message to the console.

 **Expected Output:** 

```
Hello, welcome to Java!  
Welcome to the world of Java!  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:23:29.850Z  

```java
class Codechef {
    // Static method without parameters and return type
    public static void printMessage() {
        System.out.println("Hello, welcome to Java!");
    }
    
    // Static method with no return type and no parameters
    public static void getWelcomeMessage() {
        System.out.println("Welcome to the world of Java!");
    }
    
    public static void main(String[] args) {
        // Calling static method without parameters and return type
        printMessage();
        
        // Calling static method with no return type and no parameters
        getWelcomeMessage();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX23)