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
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a, Collections.reverseOrder());
            long chefSum = 0;
            for (int i = 0; i < n; i += 2) {
                chefSum += a[i];
            }
            System.out.println(chefSum);
        }
        sc.close();
    }
}