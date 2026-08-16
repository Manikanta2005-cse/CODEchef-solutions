import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare a 2x2 matrix
        int[][] matrix = new int[2][2];

        // Take user input for each element
        System.out.println();
        matrix[0][0] = scanner.nextInt();
        matrix[0][1] = scanner.nextInt();
        matrix[1][0] = scanner.nextInt();
        matrix[1][1] = scanner.nextInt();

        // Display the matrix
        System.out.println("Matrix:");
        System.out.println(matrix[0][0] + " " + matrix[0][1]);
        System.out.println(matrix[1][0] + " " + matrix[1][1]);

        scanner.close();
    }
}