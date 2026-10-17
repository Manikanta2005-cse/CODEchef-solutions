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
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, Collections.reverseOrder());
            
            long l1 = -1, l2 = -1;
            for (int i = 0; i < n - 1; i++) {
                if (a[i].equals(a[i + 1])) {
                    if (l1 == -1) {
                        l1 = a[i];
                        i++;
                    } else if (l2 == -1) {
                        l2 = a[i];
                        i++;
                        break;
                    }
                }
            }
            
            if (l1 != -1 && l2 != -1) {
                System.out.println(l1 * l2);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}