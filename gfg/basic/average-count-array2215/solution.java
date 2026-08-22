class Solution {
    public int[] countArray(int[] arr, int x) {
        int n = arr.length;
        int[] freq = new int[100001];
        for (int num : arr) {
            freq[num]++;
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int avg = (arr[i] + x) / 2;
            result[i] = freq[avg];
        }

        return result;
    }
}