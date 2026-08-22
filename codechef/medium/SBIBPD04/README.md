# SBIBPD04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Movie Watchlist Editor

Let's create a simple "Movie Watchlist Editor" application using `ArrayList`. This will allow you to add movies to your watchlist, view them, and remove them after you've watched them. This exercise will reinforce how to add, access, and remove elements from an `ArrayList`. It will also indirectly touch upon exception handling concepts because attempting to access an invalid index would result in `IndexOutOfBoundsException`.

Here's the problem:

You need to create a program that does the following:

- Creates an ArrayList to store movie titles (strings).
- Adds three initial movie titles: "The Shawshank Redemption", "Inception", and "The Matrix".
- Prints all the movie titles, each on a new line, with their index number.
- Removes the movie at index 0 (which is "The Shawshank Redemption") because you've watched it.
- Prints the updated movie watchlist, again with index numbers on new lines.

Here's how the output should look after adding the initial movies:

```
Movie Watchlist:
0: The Shawshank Redemption
1: Inception
2: The Matrix

```

And after removing "The Shawshank Redemption":

```
Updated Movie Watchlist:
0: Inception
1: The Matrix

```

Complete the code below to achieve this.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T16:08:50.509Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/SBIBPD04)