import java.util.ArrayList;
class MovieWatchlist {

    public static void main(String[] args) {
        // 1. Create an ArrayList to store movie titles
        ArrayList<String> watchlist = new ArrayList<>();

        // 2. Add initial movie titles
        watchlist.add("The Shawshank Redemption");
        watchlist.add("Inception");
        watchlist.add("The Matrix");

        // 3. Print all movie titles with index numbers
        System.out.println("Movie Watchlist:");
        for (int i = 0; i < watchlist.size(); i++) {
            System.out.println(i + ": " + watchlist.get(i));
        }

        // 4. Remove the movie at index 0
        watchlist.remove(0);

        // 5. Print the updated movie watchlist with index numbers
        System.out.println("Updated Movie Watchlist:");
        for (int i = 0; i < watchlist.size(); i++) {
            System.out.println(i + ": " + watchlist.get(i));
        }
    }
}