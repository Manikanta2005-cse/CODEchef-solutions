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
            int k = sc.nextInt();
            int[] w = new int[n];
            long totalSum = 0;
            for (int i = 0; i < n; i++) {
                w[i] = sc.nextInt();
                totalSum += w[i];
            }
            Arrays.sort(w);
            int effectiveK = Math.min(k, n - k);
            long kidSum = 0;
            for (int i = 0; i < effectiveK; i++) {
                kidSum += w[i];
            }
            long chefSum = totalSum - kidSum;
            System.out.println(chefSum - kidSum);
        }
        sc.close();
    }
}