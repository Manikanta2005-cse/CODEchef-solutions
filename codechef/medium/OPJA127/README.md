# OPJA127

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Designing a Vehicle Blueprint

Create a Java program that models a simple vehicle blueprint. You should have two classes: `Vehicle` (the abstract base class) and `Car` (the derived class).

Vehicle (Abstract Base Class):

- Define an abstract function void startEngine() ; to represent starting the vehicle's engine.
- Define a data member name (a string) to store the name of the vehicle.

Car (Derived Class from Vehicle):

- Implement the startEngine() method to print "Car engine started for {carname}", where {carname} represents the name of the car.
- In the constructor, take a name parameter and use it to initialize the name data member.

In the main function:

- Create an instance of the Car class, providing a name for the car.
- Call the startEngine() method on the car object to simulate starting the engine.
### Task

Given the name of car as "Nano". Complete this code to display the output using `startEngine()`.

This problem allows you to practice abstraction in Java. It represents a simplified scenario where you create a blueprint for a vehicle and then implement it for a specific vehicle type.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:11:10.469Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/OPJA127)