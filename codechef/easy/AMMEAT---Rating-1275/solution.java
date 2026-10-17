import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();
            Long[] p = new Long[n];
            long totalSum = 0;
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextLong();
                totalSum += p[i];
            }
            if (totalSum < m) {
                System.out.println(-1);
                continue;
            }
            Arrays.sort(p, Collections.reverseOrder());
            long currentSum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                currentSum += p[i];
                count++;
                if (currentSum >= m) {
                    break;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}