import java.util.Scanner;

public class Main {
    static final int M = 999983;
    static final int MX = 1000000000;
    static int[] Hash = new int[M];

    // Hash function handling long and negative values safely
    static int f(long x) {
        int hash = (int) (x % M);
        if (hash < 0) {
            hash += M;
        }
        return hash;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        long ans = 0; 

        for (int i = 0; i < n; i++) {
            if (a[i] > -31623 && a[i] < 31623) {
                ans += Hash[f(a[i] * a[i])];
            }
            Hash[f(a[i])]++;
        }

        System.out.println(ans);
        scanner.close();
    }
}