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