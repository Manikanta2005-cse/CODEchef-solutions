import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> freqMap = new HashMap<>();
            int maxFreq = 0;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                int count = freqMap.getOrDefault(num, 0) + 1;
                freqMap.put(num, count);
                if (count > maxFreq) {
                    maxFreq = count;
                }
            }
            System.out.println(n - maxFreq);
        }
        sc.close();
    }
}