# CYMZCY05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Abstract Class for Media Players

In this practice problem, you will learn how to apply abstraction using abstract classes in Java. You are provided with a class `MediaPlayer` and its two subclasses: `AudioPlayer` and `VideoPlayer`.

 **Task** 
Complete the missing lines in the code to:

- Declare the MediaPlayer class as abstract using the abstract keyword.
- Declare a private instance variable fileName in the MediaPlayer class.
- Create a constructor in the MediaPlayer class to initialize the fileName.
- Implement a getter method getFileName() to return the media file's name.

The subclasses `AudioPlayer` and `VideoPlayer` must:

- Inherit from the MediaPlayer class.
- Use the super keyword to call the parent class constructor.

 **Expected Output:** 

```
Playing audio: song.mp3
Playing video: movie.mp4

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T16:27:40.785Z  

```java
abstract class MediaPlayer {
    private String fileName;

    public MediaPlayer(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract void play();
}

class AudioPlayer extends MediaPlayer {
    public AudioPlayer(String fileName) {
        super(fileName);
    }

    @Override
    public void play() {
        System.out.println("Playing audio: " + getFileName());
    }
}

class VideoPlayer extends MediaPlayer {
    public VideoPlayer(String fileName) {
        super(fileName);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + getFileName());
    }
}

class Codechef {
    public static void main(String[] args) {
        AudioPlayer audio = new AudioPlayer("song.mp3");
        VideoPlayer video = new VideoPlayer("movie.mp4");

        audio.play();
        video.play();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CYMZCY05)