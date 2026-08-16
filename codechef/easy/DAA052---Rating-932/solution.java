import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);

            int maxFrequency = 0, mode = 0;

            for (int i = 0; i < n; i++) {
                int j = i;
                // Run while we get the same adjacent elements
                while (j < n && a[j] == a[i]) {
                    j++;
                }

                int frequency = j - i;
                if (frequency > maxFrequency) {
                    mode = a[i];
                    maxFrequency = frequency;
                }

                i = j - 1;
            }

            System.out.println(mode);
        }
    }
}