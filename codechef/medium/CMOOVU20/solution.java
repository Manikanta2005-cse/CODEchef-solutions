import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create a 3x3 integer 2D array
        int[][] marks = new int[3][3];

        // Step 2: Read 9 integers to fill the array row by row
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner.nextInt();
            }
        }

        // Step 3: Use nested loops to calculate total marks per student (row-wise)
        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            System.out.println("Total marks for student " + i + ": " + total);
        }

        scanner.close();
    }
}