import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                Map<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < n; i++) {
                    int day = sc.nextInt();
                    map.put(day, map.getOrDefault(day, 0) + 1);
                }
                System.out.println(map.size());
            }
        }
        sc.close();
    }
}