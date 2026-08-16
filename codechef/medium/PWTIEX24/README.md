# PWTIEX24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Output of Method Without Return Type

What will be the output of the following code, which demonstrates the syntax of methods without parameters and return types?

```
public class Codechef {

    // Static method without parameters and return type
    public static void printMessage() {
        System.out.println("Hello, World!");  // Method without parameters and return type
    }

    public static void main(String[] args) {
        // Calling the static method directly
        printMessage();  // Calling the method without parameters and return type
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:23:50.128Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/PWTIEX24)