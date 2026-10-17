import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            long[] a = new long[n];
            Integer[] idxA = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                idxA[i] = i;
            }
            
            long[] b = new long[n];
            Integer[] idxB = new Integer[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
                idxB[i] = i;
            }
            
            Arrays.sort(idxA, (i, j) -> Long.compare(a[i], a[j]));
            Arrays.sort(idxB, (i, j) -> Long.compare(b[i], b[j]));
            
            long[] resA = new long[n];
            long[] resB = new long[n];
            
            for (int i = 0; i < n; i++) {
                resA[idxA[i]] = a[idxA[i]];
                resB[idxB[n - 1 - i]] = b[idxB[n - 1 - i]];
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(resA[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
            
            for (int i = 0; i < n; i++) {
                System.out.print(resB[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
        sc.close();
    }
}