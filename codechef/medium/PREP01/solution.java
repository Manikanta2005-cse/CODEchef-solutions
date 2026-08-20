import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long val = 1;
            for (int k = 1; k <= n; k++) {
                System.out.print(val + (k == n ? "" : " "));
                val = val * (n - k) / k;
            }
            System.out.println();
        }
    }
}