class Codechef {
    public static void main(String[] args) {
         int[][] matrix = {
            {1, 2, 3},  
            {4, 5, 6},  
            {7, 8, 9}   
        };

        int sum = 0;

        // Column-major traversal
        for (int j = 0; j < 3; j++) {  // Fill in column limit
            for (int i = 0; i < 3; i++) {  // Fill in row limit
                sum += matrix[i][j];  // Fill in correct indices
            }
        }

        System.out.println("Total Sum: " + sum);
    }
}
