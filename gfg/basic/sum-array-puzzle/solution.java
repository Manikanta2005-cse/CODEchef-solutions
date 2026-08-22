class Solution {
    public void sumArray(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = totalSum - arr[i];
        }
    }
}