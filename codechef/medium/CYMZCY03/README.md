# CYMZCY03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Abstract Class for Animal
- In this example, we demonstrate how abstraction works using an abstract class and subclasses that extend it.
- We define an abstract class named Animal, which contains: A common property name shared by all animals. An abstract method makeSound(), which does not have a body and must be implemented by subclasses.
- We then create two subclasses, Dog and Cat, that: Inherit the name property and constructor from Animal. Provide their own implementation of the makeSound() method.

 **When executed, the code will show:** 

```
Buddy says: Woof!
Whiskers says: Meow!

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:25:10.746Z  

```java
// This code defines an abstract class Animal with subclasses Dog and Cat
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses (we'll cover this in the next lesson)
    public abstract String makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }
}

class Codechef {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        System.out.println(dog.getName() + " says: " + dog.makeSound());
        System.out.println(cat.getName() + " says: " + cat.makeSound());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CYMZCY03)