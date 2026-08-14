# MIBIIW15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

What will be the output of the following Java code?

```
interface Flyable {
    void fly();
}

abstract class Bird {
    abstract void makeSound();
    
    void layEggs() {
        System.out.println("Laying eggs...");
    }
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }
}

class Codechef {
    public static void main(String[] args) {
        Flyable obj = new Sparrow();
        obj.fly();
        // obj.makeSound();  // Line X
    }
}

```

 **What happens if Line X is uncommented?**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:15:44.236Z  

```cpp
// Define an abstract class 'Instrument' with a constructor to initialize the name of the instrument 
// and an abstract method 'playSound'
abstract class Instrument {
    // Define a field to hold the name of the instrument
    private String name;

    // Define a constructor to initialize the name of the instrument
    public Instrument(String name){
    this.name=name;    
    }
    

    // Define an abstract method to play the sound of the instrument
    public abstract void playSound();
}

// Define an interface 'Tunable' with a method 'tune'
interface Tunable {
void tune();    
}


// Concrete class representing a Guitar
class Guitar extends Instrument {
    public Guitar(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("Strum");
    }
}

// Concrete class representing a Violin
class Violin implements Tunable {
    private String name;

    public Violin(String name) {
        this.name = name;
    }

    // Implement the tune method
    @Override
    public void tune() {
        System.out.println("Tuning the violin by adjusting its strings");
    }
}

class Codechef {

    public static void main(String[] args) {
        Guitar guitar = new Guitar("My Guitar");
        Violin violin = new Violin("My Violin");

        // Call the playSound method on the guitar
        guitar.playSound();

        // Call the tune method on the violin
        violin.tune();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MIBIIW15)