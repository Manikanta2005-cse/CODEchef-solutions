# OPJA125

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple inheritance in Java

In Java, a class can inherit from only one superclass, which means that Java does not support multiple inheritance of classes. However, Java supports multiple inheritance of interfaces. This means that a class can implement multiple interfaces to inherit their abstract methods.

In this example, we define two interfaces, `Interface1` and `Interface2`, each containing one abstract method. The `MyClass` class implements both interfaces and provides concrete implementations for the abstract methods defined in the interfaces.

When we create an instance of `MyClass` and call its `method1()` and `method2()` methods, it demonstrates multiple inheritance of interfaces in Java. This allows a class to inherit and implement multiple sets of behavior through different interfaces.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:08:55.054Z  

```java
// Define two interfaces
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

// Implement the interfaces in a class
class MyClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Method1 implementation");
    }

    @Override
    public void method2() {
        System.out.println("Method2 implementation");
    }
}

class Codechef {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        
        myObject.method1(); // Calls method1() from Interface1
        myObject.method2(); // Calls method2() from Interface2
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA125)