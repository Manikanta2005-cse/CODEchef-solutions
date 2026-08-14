# MIBIIW14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Music Instrument Sounds
- Imagine a music system where different instruments either produce sound or need to be tuned. Some instruments, like guitars, can produce sound when played, while others, like violins, require tuning before playing.
- You are asked to implement a system that uses an abstract class and an interface to model these behaviors. This exercise helps demonstrate the core differences between abstract classes (which can have constructors and abstract methods) and interfaces (which define capabilities to be implemented by other classes).

 **Task** 

- Define an abstract class Instrument: It should have a field name. Use a constructor to initialize the name of the instrument. Declare an abstract method playSound().
- Define an interface Tunable: It should declare a method tune().
- In the main() method: Call playSound() on the guitar and tune() on the violin.

 **Expected Output:** 

```
Strum
Tuning the violin by adjusting its strings

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:14:57.038Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/MIBIIW14)