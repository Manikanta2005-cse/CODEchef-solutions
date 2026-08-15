import java.util.Scanner;

public class Main {
    // Helper method to calculate the maximum non-zero streak
    public static int calculateStreak(int[] arr, int n) {
        int streak = 0;
        int maxStreak = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                streak++;
                maxStreak = Math.max(maxStreak, streak);
            } else {
                streak = 0; // Reset streak on a 0-day
            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt(); // Number of test cases
            
            while (t-- > 0) {
                int n = scanner.nextInt();
                int[] a = new int[n];
                int[] b = new int[n];
                
                // Read Om's daily solve count
                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();
                }
                
                // Read Addy's daily solve count
                for (int i = 0; i < n; i++) {
                    b[i] = scanner.nextInt();
                }
                
                int omStreak = calculateStreak(a, n);
                int addyStreak = calculateStreak(b, n);
                
                // Determine winner
                if (omStreak > addyStreak) {
                    System.out.println("OM");
                } else if (omStreak < addyStreak) {
                    System.out.println("ADDY");
                } else {
                    System.out.println("DRAW");
                }
            }
        }
        scanner.close();
    }
}