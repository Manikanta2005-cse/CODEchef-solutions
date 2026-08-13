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