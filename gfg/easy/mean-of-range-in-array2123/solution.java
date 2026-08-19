import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        int n = arr.length;
        long[] prefixSum = new long[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            long sum = prefixSum[r] - (l > 0 ? prefixSum[l - 1] : 0);
            int count = r - l + 1;
            result.add((int) (sum / count));
        }

        return result;
    }
}