# EPFADS09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - Return Type Conflict

What will happen if a class tries to implement two interfaces that have methods with the same name and parameters but different return types?

```
interface A {
    int getData();
}

interface B {
    String getData();
}

class MyClass implements A, B {
    // What happens here?
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:24:14.447Z  

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

[View on CodeChef](https://www.codechef.com/problems/EPFADS09)