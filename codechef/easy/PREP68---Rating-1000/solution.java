public static int hasPairWithDifference(int[] A, int N, int B) {
        Arrays.sort(A);
        int i = 0, j = 1;
        
        while (i < N && j < N) {
            if (i != j && A[j] - A[i] == B) {
                return 1;
            } else if (A[j] - A[i] < B) {
                j++;
            } else {
                i++;
            }
        }
        return 0;
    }