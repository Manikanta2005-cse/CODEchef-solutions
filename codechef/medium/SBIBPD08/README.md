# SBIBPD08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Playlist Management

Let's create a simple playlist management system using `LinkedList`. This will help you understand how `LinkedList` can be used to add, remove, and display songs in a playlist.

Here's the scenario: You want to create a playlist and add some songs to it. You also want to be able to remove songs and display the current playlist. Because songs can be added or removed from anywhere in the playlist, `LinkedList` is a good choice.

Here's the code that does exactly that. Read through it, paying attention to how the `LinkedList` is used. I've added comments to guide you. Then copy and paste the code into your IDE, compile and run it, and observe the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T16:11:02.333Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/SBIBPD08)