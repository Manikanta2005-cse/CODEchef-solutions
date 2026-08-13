# NAJKFV05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Vehicle Abstraction
- In this practice problem, you are given a base class Vehicle that contains a method startEngine() with a default implementation, and two classes, Car and Motorcycle, that are derived from the Vehicle class.
- Your task is to override the startEngine() method in the derived classes to provide their own specific engine-starting behavior.
- In the main() method, objects of type Vehicle, Car, and Motorcycle are already created. Call the startEngine() method on each object to display how abstraction allows us to use a common interface while hiding the specific details of each vehicle type.

 **Task** 

- Override the startEngine() method in the Car and Motorcycle classes. In the Car class → print: Car engine starting with a roar... In the Motorcycle class → print: Motorcycle engine starting with a vroom...
- Call the startEngine() method on each of the objects: Vehicle, Car, and Motorcycle.

 **Expected Output:** 

```
Vehicle engine starting...
Car engine starting with a roar...
Motorcycle engine starting with a vroom...

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:23:43.273Z  

```java
class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine starting...");
    }
}

// Subclass Car inheriting from Vehicle
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine starting with a roar...");
    }
}

// Subclass Motorcycle inheriting from Vehicle
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starting with a vroom...");
    }
}

class Codechef {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.startEngine(); // From Vehicle

        Car myCar = new Car();
        myCar.startEngine(); // Overridden in Car

        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.startEngine(); // Overridden in Motorcycle
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NAJKFV05)