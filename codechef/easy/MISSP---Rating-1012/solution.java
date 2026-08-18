import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> counts = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                int type = sc.nextInt();
                counts.put(type, counts.getOrDefault(type, 0) + 1);
            }
            
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
        sc.close();
    }
}