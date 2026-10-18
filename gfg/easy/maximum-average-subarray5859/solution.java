class Solution {
    public int findMaxAverage(List<Integer> arr, int k) {
        long currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr.get(i);
        }

        long maxSum = currentSum;
        int minIndex = 0;

        for (int i = k; i < arr.size(); i++) {
            currentSum += arr.get(i) - arr.get(i - k);
            if (currentSum > maxSum) {
                maxSum = currentSum;
                minIndex = i - k + 1;
            }
        }

        return minIndex;
    }
}