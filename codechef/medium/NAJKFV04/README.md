# NAJKFV04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Animal Sounds
- Let’s test your understanding of abstraction in object-oriented programming. You are given a base class Animal that contains a name property and a method makeSound() with a default implementation, and two classes Dog and Cat derived from the Animal class.
- Your task is to override the makeSound() method in the derived classes to return their respective sounds.
- In the main() method, two objects are already created — one of type Dog and one of type Cat. Print their names using the getName() method along with the sounds they make.

 **Expected Output:** 

```
Buddy says: Woof!
Whiskers says: Meow!

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:22:13.452Z  

```java
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String makeSound() {
        // Default implementation
        return "Generic animal sound";
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Override the makeSound() method to return "Woof!"
    public String makeSound() {
        return "Woof!";
    }
    
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Override the makeSound() method to return "Meow!"
    public String makeSound() {
        return "Meow!";
    }
    
}

class Codechef {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog("Buddy");

        // Create a Cat object
        Cat cat = new Cat("Whiskers");

        // Print the sounds of the animals
        System.out.println(dog.getName() + " says: " + dog.makeSound());
        System.out.println(cat.getName() + " says: " + cat.makeSound());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NAJKFV04)