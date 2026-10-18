class Solution {
    public int leastAvg(int[] arr, int k) {
        int n = arr.length;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int minSum = currentSum;
        int minIndex = 0;

        for (int i = k; i < n; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];
            if (currentSum < minSum) {
                minSum = currentSum;
                minIndex = i - k + 1;
            }
        }

        return minIndex + 1;
    }
}