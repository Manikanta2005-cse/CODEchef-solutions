public static int searchInsertPosition(int[] A, int N, int K) {
    int low = 0;
    int high = N - 1;
    
    while (low <= high) {
        int mid = low + (high - low) / 2;
        
        if (A[mid] == K) {
            return mid;
        } else if (A[mid] < K) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    
    return low;
}