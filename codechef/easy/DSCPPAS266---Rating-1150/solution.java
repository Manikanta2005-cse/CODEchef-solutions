
public static boolean canReduce(int N, int[] arr) {
    Arrays.sort(arr);
    for (int i = 0; i < N - 1; i++) {
        if (arr[i + 1] - arr[i] > 1) {
            return false;
        }
    }
    return true;
}