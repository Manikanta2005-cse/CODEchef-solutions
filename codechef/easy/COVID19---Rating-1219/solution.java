import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
            }
            int minInfected = n;
            int maxInfected = 1;
            int currentCluster = 1;

            for (int i = 1; i < n; i++) {
                if (x[i] - x[i - 1] <= 2) {
                    currentCluster++;
                } else {
                    minInfected = Math.min(minInfected, currentCluster);
                    maxInfected = Math.max(maxInfected, currentCluster);
                    currentCluster = 1;
                }
            }
            minInfected = Math.min(minInfected, currentCluster);
            maxInfected = Math.max(maxInfected, currentCluster);

            System.out.println(minInfected + " " + maxInfected);
        }
        sc.close();
    }
}