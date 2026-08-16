class Codechef {
    public static void main(String[] args) {
        int[][] dataTable = new int[3][5];  // Declare a 3x5 matrix

        int num = 10;  // Fill in the starting value
        for (int i = 0; i < dataTable.length; i++) {
            for (int j = 0; j < dataTable[i].length; j++) {
                dataTable[i][j] = num++;
            }
        }

        // Print each element with its position
        for (int i = 0; i < dataTable.length; i++) {
            for (int j = 0; j < dataTable[i].length; j++) {  // Fill in the correct loop condition
                System.out.println("Element at [" + i + "][" + j + "] = " + dataTable[i][j]);  // Fill in the missing values
            }
        }
    }
}
