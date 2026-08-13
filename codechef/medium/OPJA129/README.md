# OPJA129

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Purpose of Abstract Methods

What is the primary purpose of a abstract method in Java?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:12:16.075Z  

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

[View on CodeChef](https://www.codechef.com/problems/OPJA129)