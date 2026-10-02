import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        long totalTiles = 0;
        for (int i = 0; i < n; i++) {
            totalTiles += sc.nextLong();
        }
        
        long root = (long) Math.sqrt(totalTiles);
        if (root * root == totalTiles) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}