# MIBIIW03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Animal Sound Interface
- In this example, we demonstrate how interfaces in Java help achieve abstraction by defining a common behavior that multiple classes can implement in their own way.
- We define an interface named Animal that declares a method makeSound(). Interfaces in Java cannot contain any concrete method implementations (until Java 8+, which allows default/static methods). This means any class that implements the Animal interface must provide its own implementation of the makeSound() method.
- Two classes - Dog and Cat - implement the Animal interface. Both provide their own version of makeSound(), making it possible to treat different types of animals using the same interface reference while allowing them to behave differently.

 **When executed, the code will show:** 

```
Woof!
Meow!

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T16:59:32.661Z  

```java
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Codechef {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound();
        myCat.makeSound();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MIBIIW03)