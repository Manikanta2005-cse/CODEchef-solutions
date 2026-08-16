import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create and fill a 3x3 array
        int[][] sales = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sales[i][j] = scanner.nextInt();
            }
        }

        // Step 2: Row-wise sum
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += sales[i][j];
            }
            System.out.println("Row " + i + " total: " + rowSum);
        }

        // Step 3: Column-wise sum
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += sales[i][j];
            }
            System.out.println("Column " + j + " total: " + colSum);
        }

        scanner.close();
    }
}