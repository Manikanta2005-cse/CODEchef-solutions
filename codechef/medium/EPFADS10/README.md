# EPFADS10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - Default Method Conflict

What will happen if two interfaces define a  **default method with the same name and parameters**, and a class implements both interfaces but  **does not override**  that method?

```
interface A {
    default void greet() {
        System.out.println("Hello from A");
    }
}

interface B {
    default void greet() {
        System.out.println("Hello from B");
    }
}

class MyClass implements A, B {
    // No override of greet()
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:24:39.502Z  

```cpp
interface Recorder {
    // Method to record audio
    void recordAudio(); 
}

interface Player {
    // Method to play audio
    void playAudio(); 
}

// Create a class that implements both interfaces
class AudioDevice implements Recorder, Player {

    // Implement the recordAudio method
    @Override
    public void recordAudio() {
        System.out.println("Recording audio...");
    }

    // Implement the playAudio method
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create an instance of AudioDevice
        AudioDevice device = new AudioDevice();

        // Call the methods
        device.recordAudio();  // Output: Recording audio...
        device.playAudio();    // Output: Playing audio...
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EPFADS10)