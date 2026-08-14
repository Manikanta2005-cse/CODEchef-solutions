# EPFADS05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Audio Recorder & Player
- Imagine you are developing a multimedia system that can record and play audio. Instead of putting all the functionality into one class directly, you'll use interfaces to separate the behaviors of recording and playing. Then, you'll implement these behaviors in a single device class.
- You are given two interfaces: Recorder → defines the ability to record audio. Player → defines the ability to play audio.

 **Task** 

- Declare an interface Recorder with a method recordAudio().
- Declare another interface Player with a method playAudio().
- Override both recordAudio() and playAudio() methods in the AudioDevice class.
- Inside recordAudio() → print: Recording audio...
- Inside playAudio() → print: Playing audio...
- In the main() method of the Codechef class: Call both recordAudio() and playAudio() on the object.

 **Expected Output:** 

```
Recording audio...
Playing audio...

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T17:22:20.562Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/EPFADS05)