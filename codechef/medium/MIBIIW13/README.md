# MIBIIW13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Animal Sound
- In this example, we demonstrate the difference between an abstract class and an interface using a practical example.
- We define an abstract class Animal that holds a common property name and an abstract method makeSound(). This allows specific animal types to implement their own unique sounds while inheriting shared properties.
- Next, we define an interface Speakable that declares a method speak(). Both the Dog class (which extends Animal) and the Toy class (unrelated to Animal) implement the Speakable interface, showing how interfaces can be used to provide common behavior across unrelated types.

 **When executed, the code will show:** 

```
Buddy says: Woof!
Toy says: Beep!

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:11:11.640Z  

```java
abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}

interface Speakable {
    void speak();
}

class Dog extends Animal implements Speakable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void speak() {
        System.out.print(name + " says: ");
        makeSound();
    }
}

class Toy implements Speakable {
    @Override
    public void speak() {
        System.out.println("Toy says: Beep!");
    }
}

class Codechef {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Toy toy = new Toy();

        dog.speak();
        toy.speak();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MIBIIW13)