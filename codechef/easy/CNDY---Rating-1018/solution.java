import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            boolean possible = true;
            for (int i = 0; i < 2 * n; i++) {
                int a = sc.nextInt();
                map.put(a, map.getOrDefault(a, 0) + 1);
                if (map.get(a) > 2) {
                    possible = false;
                }
            }
            if (possible) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}