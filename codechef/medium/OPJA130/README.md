# OPJA130

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Abstract Class Constructors in Java

Can an abstract class have constructors in Java?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:12:56.981Z  

```cpp
abstract class Vehicle {
    String name;

    Vehicle(String n) {
        name = n;
    }

    abstract void startEngine();
}

class Car extends Vehicle {
    Car(String n) {
        super(n);
    }

    @Override
    void startEngine() {
        System.out.println("Car engine started for " + name + ".");
    }
}

class Codechef {
    public static void main(String[] args) {
        String carName = "Nano";

        Car myCar = new Car(carName);
        myCar.startEngine();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OPJA130)