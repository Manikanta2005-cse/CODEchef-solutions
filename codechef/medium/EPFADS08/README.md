# EPFADS08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

What will happen if a class implements the following two interfaces?

```
interface A {
    int show();
}

interface B {
    int show();
}

class MyClass implements A, B {
    public int show() {
        return 42;
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:23:42.594Z  

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

[View on CodeChef](https://www.codechef.com/problems/EPFADS08)