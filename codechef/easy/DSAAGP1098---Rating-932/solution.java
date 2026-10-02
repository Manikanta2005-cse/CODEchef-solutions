public static boolean check(int[] arr, int d, int n, int c) {
    c--;
    int prev = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] - prev >= d) {
            c--;
            prev = arr[i];
        }
        if (c == 0) return true;
    }
    return false;
}