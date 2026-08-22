import java.util.ArrayList;

 class MusicPlaylistEditor {

    public static void main(String[] args) {
        // 1. Create an ArrayList to store song titles
        ArrayList<String> playlist = new ArrayList<>();

        // 2. Add three initial song titles
        playlist.add("Bohemian Rhapsody");
        playlist.add("Imagine");
        playlist.add("Stairway to Heaven");

        // 3. Print all the song titles with their index number
        System.out.println("Music Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(i + ": " + playlist.get(i));
        }

        // 4. Insert "Hotel California" at index 1
        playlist.add(1, "Hotel California");

        // 5. Remove the song at index 2
        playlist.remove(2);

        // 6. Print the updated playlist with index numbers
        System.out.println("\nUpdated Music Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(i + ": " + playlist.get(i));
        }
    }
}