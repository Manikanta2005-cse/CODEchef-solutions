import java.util.ArrayList;

class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}

class Playlist {
    public static void main(String[] args) {
        ArrayList<Song> playlist = new ArrayList<>();

        Song song1 = new Song("Bohemian Rhapsody", "Queen");
        Song song2 = new Song("Imagine", "John Lennon");
        Song song3 = new Song("Hotel California", "The Eagles");

        playlist.add(song1);
        playlist.add(song2);
        playlist.add(song3);

        // Display the playlist
        System.out.println("My Playlist:");
        Song song = playlist.get(0);
        System.out.println((1) + ". " + song.getTitle() + " by " + song.getArtist());
        song = playlist.get(1);
        System.out.println((2) + ". " + song.getTitle() + " by " + song.getArtist());
        song = playlist.get(2);
        System.out.println((3) + ". " + song.getTitle() + " by " + song.getArtist());
    }
}