class Codechef {
    public static void main(String[] args) {
        // Define and initialize a 3x3 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},   // Row 0
            {4, 5, 6},   // Row 1
            {7, 8, 9}    // Row 2
        };

        // -------------------------------
        // Row-major traversal
        // -------------------------------
        // In row-major order, we go row by row
        // For each row, we access its elements from left to right
        System.out.println("Row-major traversal:");
        for (int i = 0; i < 3; i++) {           // Loop through each row
            for (int j = 0; j < 3; j++) {       // Loop through each column in the current row
                System.out.print(matrix[i][j] + " "); // Print element at row i, column j
            }
        }
        System.out.println(); // Move to next line after row-major output

        // -------------------------------
        // Column-major traversal
        // -------------------------------
        // In column-major order, we go column by column
        // For each column, we access elements from top to bottom
        System.out.println("Column-major traversal:");
        for (int j = 0; j < 3; j++) {           // Loop through each column
            for (int i = 0; i < 3; i++) {       // Loop through each row in the current column
                System.out.print(matrix[i][j] + " "); // Print element at row i, column j
            }
        }
        System.out.println(); // Move to next line after column-major output
    }
}
