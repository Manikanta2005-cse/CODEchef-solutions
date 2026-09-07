import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();
            boolean possible = true;
            for (int i = 0; i < 2 * n; i++) {
                int val = sc.nextInt();
                freq.put(val, freq.getOrDefault(val, 0) + 1);
                if (freq.get(val) > 2) {
                    possible = false;
                }
            }
            if (possible) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}