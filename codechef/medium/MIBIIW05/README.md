# MIBIIW05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

What will be the output of the following Java program?

```
interface Calculate
{
   void cal(int item);
}

class Display implements Calculate
{
   int value;
   public void cal(int value)
   {
       this.value = value * value;           
   }
}

class Codechef
{
   public static void main(String args[])
   {
       Display display = new Display();
       display.value = 0;     
       display.cal(4);
       System.out.print(display.value);
   }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:06:19.386Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/MIBIIW05)