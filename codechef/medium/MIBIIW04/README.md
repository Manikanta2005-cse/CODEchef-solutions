# MIBIIW04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Electronic Device Interface

You need to define an interface named `ElectronicDevice` that declares two methods: `powerOn()` and `powerOff()`, and you need to complete the implementation of two classes, `Television` and `Smartphone`, both of which implement the `ElectronicDevice` interface.

 **Task** 

- Define an interface ElectronicDevice that declares two methods, powerOn() and powerOff().
- Make the Television and Smartphone classes implement the ElectronicDevice interface.
- In the main() method, call the powerOn() and powerOff() methods for both devices.

 **Expected Output:** 

```
Television is ON  
Television is OFF  
Smartphone is ON  
Smartphone is OFF

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:05:37.388Z  

```java
// Interface declaration
interface ElectronicDevice {
    void powerOn();
    void powerOff();
}

// Class Television implementing ElectronicDevice interface
class Television implements ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("Television is ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Television is OFF");
    }
}

// Class Smartphone implementing ElectronicDevice interface
class Smartphone implements ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("Smartphone is ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Smartphone is OFF");
    }
}

// Main class
class Codechef {
    public static void main(String[] args) {
        ElectronicDevice myTelevision = new Television();
        ElectronicDevice mySmartphone = new Smartphone();

        myTelevision.powerOn();
        myTelevision.powerOff();

        mySmartphone.powerOn();
        mySmartphone.powerOff();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MIBIIW04)