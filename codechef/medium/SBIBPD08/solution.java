import java.util.LinkedList;
import java.util.List;

 class PlaylistManager {
    public static void main(String[] args) {
        // Creating a LinkedList to store the playlist
        List<String> playlist = new LinkedList<>();

        // Adding songs to the playlist
        playlist.add("Bohemian Rhapsody");
        playlist.add("Stairway to Heaven");
        playlist.add("Hotel California");
        playlist.add("Imagine");

        System.out.println("Current Playlist: " + playlist);

        // Adding a song at the beginning of the playlist
        ((LinkedList<String>) playlist).addFirst("Yesterday");
        System.out.println("Playlist after adding to the beginning: " + playlist);


        // Adding a song at the end of the playlist
        ((LinkedList<String>) playlist).addLast("Hey Jude");
        System.out.println("Playlist after adding to the end: " + playlist);

        // Removing a song from the playlist
        playlist.remove("Stairway to Heaven");
        System.out.println("Playlist after removing a song: " + playlist);

        // Removing a song from the beginning of the playlist
        ((LinkedList<String>) playlist).removeFirst();
        System.out.println("Playlist after removing first song: " + playlist);

        // Removing a song from the end of the playlist
        ((LinkedList<String>) playlist).removeLast();
        System.out.println("Playlist after removing last song: " + playlist);

        // Checking if a song is in the playlist
        boolean containsHotelCalifornia = playlist.contains("Hotel California");
        System.out.println("Does the playlist contain 'Hotel California'? " + containsHotelCalifornia);

        // Getting the size of the playlist
        int playlistSize = playlist.size();
        System.out.println("Playlist size: " + playlistSize);

        // Clearing the playlist
        playlist.clear();
        System.out.println("Playlist after clearing: " + playlist);
    }
}