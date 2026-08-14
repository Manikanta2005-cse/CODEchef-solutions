# EPFADS03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Employee Roles
- In this example, we demonstrate how multiple interfaces can be used in Java to allow a class to inherit behaviors from more than one source. Java does not support multiple inheritance using classes to avoid issues like the Diamond Problem, but it allows a class to implement multiple interfaces to represent different roles or capabilities.
- We define two interfaces: Developer, which has a code() method representing coding work. Tester, which has a test() method representing testing work.
- A single class, QualityEngineer, implements both Developer and Tester, meaning it must provide implementations for both code() and test() methods. This simulates a real-world scenario where one person (or object) can take on multiple responsibilities.

 **When executed, the code will show:** 

```
Writing code...
Running tests...

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:16:26.540Z  

```java
interface Developer {
    void code();
}

interface Tester {
    void test();
}

class QualityEngineer implements Developer, Tester {
    @Override
    public void code() {
        System.out.println("Writing code...");
    }

    @Override
    public void test() {
        System.out.println("Running tests...");
    }
}

class Codechef {
    public static void main(String[] args) {
        QualityEngineer qa = new QualityEngineer();
        qa.code();
        qa.test();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EPFADS03)